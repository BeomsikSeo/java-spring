<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {

		$('#result').empty()
		$.ajax({
			url : "list5",
			success : function(x) {
				$('#result').append(x)
			} // success
		}) // ajax

		$('#b1').click(function() {
			// 기존의 것 삭제됨.
			$('#result').empty()
			$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b1

		$('#b2').click(function() {
			// 기존의 것 삭제됨.
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 2
				},
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b2

		$('#b3').click(function() {
			// 기존의 것 삭제됨.
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 30
				},
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b3

		$('#b4').click(function() {
			// 기존의 것 삭제됨.
			$('#result').empty()
			$.ajax({
				url : "one5",
				data : {
					id : "apple"
				},
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b4

		$('#b5').click(function() {
			// 기존의 것 삭제됨.
			$('#result').empty()
			$.ajax({
				url : "one6",
				data : {
					no : "2"
				},
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b5

		$('#b6').click(function() {
			// 기존의 것 삭제됨.
			$('#result').empty()
			$.ajax({
				url : "list7",
				success : function(x) {
					$('#result').append(x)
				} // success
			}) // ajax
		}) // b6

		$('#b7').click(function() {

			no = $('#no').val()
			content = $('#content').val()

			$.ajax({
				url : "update3",
				data : {
					no : no,
					content : content
				},
				success : function() {
					alert('수정성공')
					$('#no').val('')
					$('#content').val('')
					$('#result').empty()
					$.ajax({
						url : "list5",
						success : function(x) {
							$('#result').append(x)
						} // success
					}) // ajax
				} // success
			}) // ajax
		}) // b7

		$('#b8').click(function() {

			no2 = $('#no2').val()

			$.ajax({
				url : "delete3",
				data : {
					no : no2
				},
				success : function() {
					document.location.reload()
					// location.href="ajax_text.jsp"
				} // success
			}) // ajax
		}) // b8
		
		$('#b9').click(function() {
			// 기존의 것 삭제됨.
			$('#result').empty()
			$.ajax({
			crossOrigin: true,
			url:'http://api.openweathermap.org/data/2.5/weather?q=seoul&lang=kr&appid=3a203368d9097515b05f697adf45eec8&units=metric',
			dataType : 'json',
			success: function(x){
				console.log(x);
				$('#result').html("위치"+x.name+"<br>"+
						"날씨"+x.weather[0].description+"<br>"+
						"풍속"+x.wind.speed+"<br>"+
						"최고 기온"+x.main.temp_max+"<br>"+
						"최저 기온"+x.main.temp_min+"<br>"+
						"체감 온도"+x.main.feels_like+"<br>"+
						"구름"+x.clouds.all+"<br>"+
						"날씨 이미지: <img src='http://openweathermap.org/img/w/" + x.weather[0].icon + ".png'>")
				}
			})
		}) // b9
	}) // $
</script>
</head>
<body>
	<button id="b1">bbs 리스트 가지고 오기</button>
	<button id="b2">bbs번호 2번 reply 리스트 가지고 오기</button>
	<button id="b3">bbs번호 30번 reply 리스트 가지고 오기</button>
	<!-- list6, bbsno: 30 -->
	<button id="b4">member id가 apple인 사람 정보 가지고 오기</button>
	<!-- one5, id: apple, views/one5.jsp -->
	<button id="b5">bbs no가 2인 게시물의 상세 정보 가지고 오기</button>
	<!-- one6, no: 1, views/one6.jsp -->
	<button id="b6">member의 모든 리스트 가지고 오기</button>
	<br>
	<!-- list7, views/list7.jsp -->
	<hr color="red">
	수정할 게시판 번호 :
	<input id="no">
	<br> 수정내용 :
	<input id="content">
	<br>
	<button id="b7">bbs 수정</button>
	<!-- update3, no:input, content:input, views/update3.jsp -->
	<hr color="red">
	삭제할 게시판 번호 :
	<input id="no2">
	<br>
	<button id="b8">bbs 삭제</button>
	<hr color="red">
	<button id="b9">날씨정보</button>
	<!-- delete3, no:input, views/delete3.jsp-->

	<!-- ajax_test.jsp 시작하자마자 bbs list를 result에 넣어주세요! -->
	<!-- 버튼을 2개 만들어서
	 a) bbs 수정 버튼을 누르면 input에서 수정할 no, content를 입력받아 수정이 성공했으면 수정완료! 출력
	 b) bbs 삭제 버튼을 누르면 input에서 삭제할 no를 입력받아 삭제가 성공했으면 ajax_test.jsp 재시작! -->
	<!-- ajax를 이용해 날시정보를 가지고 오세요..! -->
	<hr color="red">
	<div id="result" style="background: yellow;"></div>
</body>
</html>