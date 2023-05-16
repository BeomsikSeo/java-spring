<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	//HttpServletRequest request = new HttpServletRequest();
    	String no = request.getParameter("no"); // String, "100"
    	String content = request.getParameter("content");
    	
    	BbsVO bag = new BbsVO();
    	bag.setNo(Integer.parseInt(no));
    	bag.setContent(content);
    	
    	BbsDAO dao = new BbsDAO();
    	dao.update(bag);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 수정을 원하는 번호는 <%= no %>
당신이 수정을 원하는 contents는 <%= content %>
</body>
</html>