package com.multi.mvc300;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록!
public class MemberController {

	@Autowired // 싱글톤으로 만들어져있는 걸 찾아서 주소를 넣어줘~ (주소를 찾아주는 역할)
			   // MemberDAO의 싱글톤 객체 ram의 어디에 있는지 찾아서 그 주소를 아래 변수에 넣어주세요.
			   // DI라고 함. (Dependency Injection, 의존성주입)
	MemberDAO dao; // 전역변수(글로벌 변수)
	// 컨트롤 하는 기능(CRUD)
	// 회원가입, 수정, 탈퇴, 정보검색
	
	// 클래스 내에서 기능처리 담당
	// 멤버변수 + 멤버메서드
	// 하나의 요청당 하나의 메서드
	// 하나의 버튼호출당 하나의 함수 연결!
	// 요청된 주소가 어떻게 될 때
	// 바로 아래에 있는 메서드가 호출이 될 지를
	// 써 주어야 한다.
	
//	@RequestMapping("login")
//	public String login(MemberVO bag, HttpSession session) {
//		System.out.println(bag);
//		// dao를 이용해서 db처리할 예정.
//		// views 아래로 넘어가게 되어있음.
//		// views 아래 login.jsp를 호출하게 됨.
//		int result = dao.login(bag); // 1, 0
//		if (result == 1) {
//			// 로그인이 성공하면, 세션을 잡아두자.!!!
//			// session을 JSP에선 그냥 씀 (내장된 객체)
//			// 자바에선 내장된 객체 개념이 없기때문에 스프링에게 객체를 달라고 해야함 => 파라미터
//			session.setAttribute("id", bag.getId());
//			return "ok"; // views아래 파일이름.jsp
//		} else {
//			return "redirect:member.jsp"; // views로 넘어가지 않고 webapp로 돌아오고싶을때
//										  // redirect:
//		}
//	}
//	
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		//MemberDAO dao = new MemberDAO();
		//dao에게 insert요청!!
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete요청됨.");
		System.out.println(id);
		
		dao.delete(id);
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one 요청됨.");
		System.out.println(id);
		
		MemberVO bag = dao.one(id);
		// bag에 검색결과 다 들어있음.
		// views아래 one.jsp로 쓸 수 있도록 설정해주어야 함.
		model.addAttribute("bag", bag);
		// views까지 전달할 속성으로 추가해주세요.
	}
//	
//	@RequestMapping("one5")
//	public void one5(String id, Model model) {
//		System.out.println("one 요청됨.");
//		System.out.println(id);
//		
//		MemberVO bag = dao.one(id);
//		// bag에 검색결과 다 들어있음.
//		// views아래 one.jsp로 쓸 수 있도록 설정해주어야 함.
//		model.addAttribute("bag", bag);
//		// views까지 전달할 속성으로 추가해주세요.
//	}
//	
//	@RequestMapping("list")
//	public void list(Model model) {
//		// Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
//		ArrayList<MemberVO> list = dao.list();
//		model.addAttribute("list", list);
//	}
//	
//	@RequestMapping("list7")
//	public void list7(Model model) {
//		// Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
//		ArrayList<MemberVO> list = dao.list();
//		model.addAttribute("list", list);
//	}
}
