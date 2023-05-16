<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("id") == null) { %>
<h3>로그인 화면입니다.</h3>
<hr color="red">
<form action="login" method="get"> <!-- get은 안써줘도 됨 post는 필수 -->
id : <input name="id" value="apple"><br>
pw : <input name="pw" value="1234"><br>
<button type="submit">서버로 전송</button> <!-- form안에 있으면 타입 안써줘도 서브밋기능으로 설정됨 (서버로 값 전송) -->
</form>
<%} else {%>
<hr color="red">
${id}님이 로그인 중입니다.~!
<a href="bbs.jsp">
	<button style="background: pink;">게시판 화면으로 go</button>
</a>
<a href="news.jsp">
	<button style="background: pink;">뉴스사이트로</button>
</a>
<br>
<a href="cafe.jsp">
	<button style="background: pink;">카페사이트로</button>
</a>
<%} %>
</body>
</html>