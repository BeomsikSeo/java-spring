<%@page import="multi.GradeVO"%>
<%@page import="multi.GradeDAO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	GradeDAO dao = new GradeDAO();
// 5, 6) dao가 리턴한 BbsVO가 들어간 ArrayList를 받는다.
ArrayList<GradeVO> list = dao.list();
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
	<h3>
		전체 성적 갯수 :
		<%=list.size()%>
	</h3>
	<table>
		<tr>
			<td>이름 검색</td>
			<td><input name="name"></td>
		</tr>
	</table>
	<%
		if (list.size() == 0) {
	%>
	<h3>등록된 성적 정보가 없습니다.</h3>
	<img src="img/reply.png" width=250 height=250>
	<%
		} else {
	%>
	<table class="table table-danger table-striped">
		<tr>
			<td>id</td>
			<td>subject</td>
			<td>name</td>
		</tr>
		<%
			for (GradeVO bag : list) {
		%>

		<tr>
			<td><%=bag.getId()%></td>
			<td><%=bag.getSubject()%></td>
			<td>
				<a href="one5.jsp?id=<%=bag.getId()%>">
					<%=bag.getName()%>
				</a>
			</td>
		</tr>
		<%
			} // for
		%>
	</table>
	<%
		} // else
	%>
</body>
</html>