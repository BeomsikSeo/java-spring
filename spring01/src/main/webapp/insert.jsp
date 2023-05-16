<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
	// MVC방법론 버전 1 ==> MVC1(JSP로만 만들었을 때)
	//		   버전 2 ==> MVC2(spring으로 만듦..!!)
	// 1. 브라우저에서 넘어오는 값 서버에서 받아주세요.
	// 넘어오는 값 제어해주는 코드(자바코드)
	// Controller(자바코드)
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		
		// MemberVO bag;
		
	// 2. dao에 데이터값을 주면서 Insert요청하세요...(자바코드)
	// DAO(JDBC4단계에 의해 코딩이 됨. 항상 방법이 똑같다.)
	// Model(자바코드)
	
	// 3. 결과를 html에 담아서 클라이언트로 전송해주세요.(html)
	// 보여주는 부분(html)
	// View(html)
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
가입 id: <%= id %><br>
가입 pw: <%= pw %><br>
가입 name: <%= name %><br>
가입 tel: <%= tel %><br>
</body>
</html>