<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
전체 조회수 <%= session.getAttribute("hits") %> <br>
<%
	if(session.getAttribute("hits") == null) {
		out.print("아무도 방문하지 않았습니다.");
	} else {
		out.print("조회수가 " + session.getAttribute("hits"));
	}
%>
<hr color="red">
</body>
</html>