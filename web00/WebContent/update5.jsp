<%@page import="multi.GradeDAO"%>
<%@page import="multi.GradeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	//HttpServletRequest request = new HttpServletRequest();
    	String id = request.getParameter("id"); // String, "100"
    	String score = request.getParameter("score");
    	
    	GradeVO bag = new GradeVO();
    	bag.setId(Integer.parseInt(id));
    	bag.setScore(Integer.parseInt(score));
    	
    	GradeDAO dao = new GradeDAO();
    	dao.update(bag);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
수정을 원하는 번호는 <%= id %>
수정된 성적은 <%= score %>
</body>
</html>