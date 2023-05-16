<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 게시물 조회수 ${count}

<h3>게시판 글 검색 화면입니다.</h3>
<a href="list2.multi">전체 검색하기</a>
<hr color="red">

<%-- <% if(session.getAttribute("id") != null) { %> --%>
<h3>게시판 글쓰기 화면입니다.</h3>
<hr color="red">
<form action="insert2.multi" method="get"> <!-- get은 안써줘도 됨 post는 필수 -->
no : <input name="no" value="1"><br>
title : <input name="title" value="today"><br>
content : <input name="content" value="good"><br>
writer : <input name="writer" value="${id}"><br>
<button type="submit">서버로 전송</button> <!-- form안에 있으면 타입 안써줘도 서브밋기능으로 설정됨 (서버로 값 전송) -->
</form>
<hr color="red">

<h3>글수정 화면입니다.</h3>
<hr color="red">
<form action="update2.multi" method="get"> <!-- get은 안써줘도 됨 post는 필수 -->
no : <input name="no" value="1"><br>
content : <input name="content" value="good"><br>
<button type="submit">서버로 전송</button> <!-- form안에 있으면 타입 안써줘도 서브밋기능으로 설정됨 (서버로 값 전송) -->
</form>
<hr color="red">

<h3>글삭제 화면입니다.</h3>
<hr color="red">
<form action="delete2.multi" method="get"> <!-- get은 안써줘도 됨 post는 필수 -->
no : <input name="no" value="1"><br>
<button type="submit">서버로 전송</button> <!-- form안에 있으면 타입 안써줘도 서브밋기능으로 설정됨 (서버로 값 전송) -->
</form>
<hr color="red">
<%-- <% } else { %> --%>
<a href="login.jsp">
	<button style="background: pink;">로그인 화면으로 go</button>
</a>
<%-- <% } %> --%>

<h3>글검색 화면입니다.</h3>
<hr color="red">
<form action="one2.multi" method="get"> <!-- get은 안써줘도 됨 post는 필수 -->
no : <input name="no" value="1"><br>
<button type="submit">서버로 전송</button> <!-- form안에 있으면 타입 안써줘도 서브밋기능으로 설정됨 (서버로 값 전송) -->
</form>
<hr color="red">

<button type="button">타입을 안써주면 자동으로 button 으로 타입이 들어감, 먹통버튼(아무 기능이 없음)</button>
</body>
</html>