<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>성적 등록</h3>
<hr color="blue">
<form action="insert4.multi">
	subject : <input name="subject"> <br>
	score : <input name="score"> <br>
	name : <input name="name"> <br>
	img : <input name="img"> <br>
	<button type="submit">정보 전송</button>
</form>
<hr color="green">
<br>

<h3>성적 삭제</h3>
<hr color="blue">
<form action="delete4.multi">
	id : <input name="id"> <br>
	<button type="submit">정보 전송</button>
</form>
<hr color="green">
<br>

<h3>성적 수정</h3>
<hr color="blue">
<form action="update4.multi">
	id : <input name="id"> <br>
	score : <input name="score"> <br>
	<button type="submit">정보 전송</button>
</form>
<hr color="green">
<br>

<h3>성적 검색</h3>
<hr color="blue">
<form action="one4.multi">
	id : <input name="id"> <br>
	<button type="submit">정보 전송</button>
</form>
<hr color="green">
<br>

<h3>성적 전체 리스트</h3>
<hr color="blue">
<a href="list4.multi">전체 검색하기</a>
<hr color="green">
</body>
</html>