<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>북마크 등록</h3>
<hr color="blue">
<form action="insert3.multi">
	name : <input name="name"> <br>
	url : <input name="url"> <br>
	img : <input name="img"> <br>
	<button type="submit">정보 전송</button>
</form>
<hr color="green">
<br>

<h3>북마크 삭제</h3>
<hr color="blue">
<form action="delete3.multi">
	id : <input name="id"> <br>
	<button type="submit">정보 전송</button>
</form>
<hr color="green">
<br>

<h3>북마크 수정</h3>
<hr color="blue">
<form action="update3.multi">
	id : <input name="id"> <br>
	url : <input name="url"> <br>
	<button type="submit">정보 전송</button>
</form>
<hr color="green">
<br>

<h3>북마크 검색</h3>
<hr color="blue">
<form action="one3.multi">
	id : <input name="id"> <br>
	<button type="submit">정보 전송</button>
</form>

<h3>북마크 전체 리스트</h3>
<a href="list3.multi">전체 검색하기</a>
<hr color="green">
</body>
</html>