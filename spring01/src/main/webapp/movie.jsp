<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>영화 장르 선택화면 입니다.</h3>
<hr color="red">
<form action="movie" method="get"> <!-- get은 안써줘도 됨 post는 필수 -->
	영화 장르 : <input name="movie" value="comic"><br>
	<button type="submit">서버로 전송</button> <!-- form안에 있으면 타입 안써줘도 서브밋기능으로 설정됨 (서버로 값 전송) -->
</form>
</body>
</html>