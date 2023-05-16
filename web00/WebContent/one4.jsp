<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
		//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
		//HttpServletRequest request = new HttpServletRequest();
		String id = request.getParameter("id"); // String, "100"
		// JSP안에 만들어진 변수는 서버의 RAM에 저장

		MovieDAO dao = new MovieDAO();
		MovieVO bag = dao.one(id);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	당신이 검색을 원하는 id는 <%= id %>
	<hr color="red">
	<table class="table table-warning table-striped">
		<tr>
			<td>영화 id</td>
			<td><%= bag.getId() %></td>
		</tr>
		<tr>
			<td>영화 제목</td>
			<td><%= bag.getTitle() %></td>
		</tr>
		<tr>
			<td>영화 내용</td>
			<td><%= bag.getContent() %></td>
		</tr>
		<tr>
			<td>영화 상영관</td>
			<td><%= bag.getLocation() %></td>
		</tr>
		<tr>
			<td>영화 감독</td>
			<td><%= bag.getDirector() %></td>
		</tr>
	</table>
</body>
</html>