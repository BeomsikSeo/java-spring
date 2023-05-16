<%@page import="multi.GradeVO"%>
<%@page import="multi.GradeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	//HttpServletRequest request = new HttpServletRequest();
    	String id = request.getParameter("id"); // String, "100"
    	// JSP안에 만들어진 변수는 서버의 RAM에 저장
    	
    	GradeDAO dao = new GradeDAO();
    	dao.delete(Integer.parseInt(id));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%= id %>번 성적 삭제 완료!
</body>
</html>