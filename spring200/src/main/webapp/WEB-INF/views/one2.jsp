<%@page import="com.multi.mvc200.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			// 1. 화면을 이동하지 않고, 서버에 insert 해달라고 요청 ==> url
			// 2. 성공하면, result아래에 append!
			content = $('#reply').val()
			writer = '${id}'
			// ${id} - 세션 잡혀있을 경우
			$.ajax({
				url: "insert4",
				data: {
					bbsno: ${bag.no},
					content: content,
					writer: writer
				},
				success: function(x) {
					alert('성공!')
					$('#result').append("- " + x + "<br>")
					$('#reply').val('')
					// val() : 입력한 값을 가지고 온다. (get)
					// val('~~~') : ~~값을 input의 value에 넣는다. (set)
				} // success
			}) // ajax
		}) // b1
	}) // $
</script>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a> <br>
<a href="list2.multi">게시물 전체 목록페이지</a> <br>
<hr color="red">
게시판 글검색 입니다. <br>
no : ${bag.no} <br>
title : ${bag.title} <br>
content : ${bag.content} <br>
writer : ${bag.writer} <br>
<hr color="red">
댓글달기 <input id="reply"> <button id="b1">입력</button>
<hr color="red">
<div id=result></div>
<!-- for-each를 이요해 댓글 목록을 프린트!! -->
<c:forEach items="${list}" var="list">
	- ${list.content}, ${list.writer} <br>
</c:forEach>
</body>
</html>