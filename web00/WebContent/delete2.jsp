<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	//HttpServletRequest request = new HttpServletRequest();
    	String no = request.getParameter("no"); // String, "100"
    	// JSP안에 만들어진 변수는 서버의 RAM에 저장
    	
    	BbsDAO dao = new BbsDAO();
    	dao.delete(Integer.parseInt(no));
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 삭제를 원하는 번호는 <%= no %>
</body>
</html>