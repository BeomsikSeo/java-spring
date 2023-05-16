<%@page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 컨트롤 하는 부분
    	// 전달되는 값들은 받아서
    	// 가방을 만든다음에 넣어주세요...
    	// dao에 가방에 들어있는 데이터를 주면서 insert해달라고 요청!해주세요..
    %>
    <jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    
    <%    
    	MovieDAO dao = new MovieDAO();
    	dao.insert(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결과를 담기위한 html코드 부분
영화 등록 완료!
</body>
</html>