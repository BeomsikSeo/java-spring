package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/check.do")
public class Check extends HttpServlet {

	// 입력값없는 생성자 메서드를 기본 생성자!!
	public Check() {
		// TODO Auto-generated method stub
	}
	
	// 객체생성시 초기값 설정할 것 있으면 web.xml에 init-param을 읽어와서 사용!
	// init()
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// 서블릿 만들 때, 패스워드가 안맞으면 어떻게 지정!!
		System.out.println("Check 서블릿 객체가 하나 만들어진다.!");
	}
	
	@Override
	public void destroy() {
		System.out.println("Check 서블릿 소멸됨");
	}
	
	// get 요청, 클라이언트로 부터 전달되는 데이터는 주소와 함께 도착
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String today = request.getParameter("today");
		String result = "그냥 있자";
		if (today.equals("맑음")) {
			result = "나가자";
		} else if (today.equals("흐림")) {
			result = "코딩";
		} else if (today.equals("비옴")) {
			result = "쇼핑";
		}
		//setContentType은 out 만들기전에 설정
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print(result);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		String pass = request.getParameter("pass");
		String result = "들어올 수 없습니다<img src='no.jpg>";
		if (pass.equals("나는왕이다")) {
			result = "들어오세요.<img src='ok.png>";
		}
		//setContentType은 out 만들기전에 설정
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				out.print(result);
				out.close();
	
	}

}
