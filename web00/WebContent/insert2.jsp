<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받아주세요. (request이용)  -->
    <!-- 2. dao에게 값 전달. (DAO 이용) -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요. -->
    <%
    	// 0. 클라이언트가 입력한 정보를 받아주세요.!
    	String title = request.getParameter("title");
    	String content = request.getParameter("content");
    	String writer = request.getParameter("writer");
    	
    	// 1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자.!
    	BbsVO bag = new BbsVO();
    	bag.setTitle(title);
    	bag.setContent(content);
    	bag.setWriter(writer);
    	
    	// 2. dao에게 가방을 전달하면서 insert해달라고 하자.!
    	BbsDAO dao = new BbsDAO();
    	dao.insert(bag);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시판 제목 : <%= title %> <br>
게시판 내용 : <%= content %> <br>
게시판 작성자 : <%= writer %> <br>
</body>
</html>