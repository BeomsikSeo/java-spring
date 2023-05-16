<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>mock 자료 등록</h3>
<hr color="blue">
<form action="insert9.multi">
	brand : <input name="drug_brand"> <br>
	name : <input name="drug_name"> <br>
	code : <input name="code"> <br>
	company : <input name="company"> <br>
	<button type="submit">정보 전송</button>
</form>
<hr color="green">
<br>

<h3>mock 자료 삭제</h3>
<hr color="blue">
<form action="delete9.multi">
	code : <input name="code"> <br>
	<button type="submit">정보 전송</button>
</form>
<hr color="green">
<br>

<h3>mock 자료 수정</h3>
<hr color="blue">
<form action="update9.multi">
	code : <input name="code"> <br>
	name : <input name="drug_name"> <br>
	<button type="submit">정보 전송</button>
</form>
<hr color="green">
<br>

<h3>mock 자료 검색</h3>
<hr color="blue">
<form action="one9.multi">
	code : <input name="code"> <br>
	<button type="submit">정보 전송</button>
</form>

<h3>mock 자료 전체 리스트</h3>
<a href="list9.multi">전체 검색하기</a>
<hr color="green">
</body>
</html>