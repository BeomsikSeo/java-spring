<%@page import="com.multi.mvc01.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a> <br>
<a href="list2.multi">게시물 전체 목록페이지</a> <br>
<hr color="red">
<%
	// 세션에서 값을 꺼내는 방법
	String id = (String)session.getAttribute("id");
	// 모델에서 값을 꺼내는 방법
	// model.addAttribute("bag", bag);
	BbsVO bag = (BbsVO)request.getAttribute("bag");
	String writer = bag.getWriter();
	if (id != null) {
	if (id.equals(writer)) {
%>
<a href="update2.multi">
	<button style="background: pink;">수정</button>
</a>
<a href="delete2.multi?no=${bag.no}">
	<button style="background: pink;">삭제</button>
</a> <br>
<% }} %>
게시판 글검색 입니다. <br>
no : ${bag.no} <br>
title : ${bag.title} <br>
content : ${bag.content} <br>
writer : ${bag.writer} <br>
</body>
</html>