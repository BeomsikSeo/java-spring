<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() { // body부분이 dom tree로 메모리에 준비가 되었을 때,
				   // 입력값으로 넣은 함수를 실행해주세요.
		// alert("웰컴..월요일~~")
		$('#b2').click(function() {
			$.ajax({
				url: "movie", // 필수
				data: {
					movie: $('#movie').val(),
					price: $('#price').val()
				},
				success: function(x) { // 필수
					$('#result').append(x + "<br>")
				},
				error: function() {
					alert('movie 요청 실패!')					
				}
			}) // ajax
		}) // b2
		
		$('#b3').click(function() {
			$.ajax({
				url: "fruit", // 필수
				success: function(x) { // 필수
					$('#result').append(x + "<br>")
				},
				error: function() {
					alert('fruit 요청 실패!')					
				}
			}) // ajax
		}) // b3
		
		$('#b4').click(function() {
			$.ajax({
				url: "tour", // 필수
				success: function(x) { // 필수
					$('#result').append(x + "<br>")
				},
				error: function() {
					alert('tour 요청 실패!')					
				}
			}) // ajax
		}) // b4
	}) // $
</script>
</head>
<body>
영화 제목 : <input id="movie"> <br>
영화 관람료 : <input id="price"> <br>
<input id="b2" type="button" value="영화 관람 확인"> <br>
<input id="b3" type="button" value="과일 목록을 가지고 와보자"> <br>
<input id="b4" type="button" value="여행 목록을 가지고 와보자">
<hr color="red">
<div id="result"></div>
</body>
</html>