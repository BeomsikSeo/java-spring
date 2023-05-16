<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- content delivery network : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url: "json.jsp",
				dataType: "json", // 이게 없으면 그냥 스트링으로 읽어옴
								  // 넣으면 자바스크립트에서 json으로 인식
				success: function(json) {
					name = json.name  // dataType 넣어줬으면 .키 로 값을 읽어옴
					age = json.age
					id = json.id
					$('#result').append(name + " " + age + " " + id + "<br>")
				} // success
			}) // ajax
		}) // b1
		
		$('#b2').click(function() {
			$.ajax({
				url: "json2.jsp",
				dataType: "json",
				success: function(json) {
					name = json[0].name  // dataType 넣어줬으면 .키 로 값을 읽어옴
					age = json[0].age
					id = json[0].id
					$('#result').append(name + " " + age + " " + id + "<br>") // 배열
				} // success
			}) // ajax
		}) // b2
		
		$('#b3').click(function() {
			$.ajax({
				url: "json3.jsp",
				dataType: "json",
				success: function(json) {
					weather = json.weather
					temp = json.temp
					humid = json.humid
					$('#result').append(weather+ " " + temp + " " + humid + "<br>")
					if(weather == 'rain') {
						$('#result').append("<img src=resources/img/rain.png><br>")
					}else if(weather == 'sun'){
						$('#result').append("<img src=resources/img/sun.jpg><br>")
					}
				} // success
			}) // ajax
		}) // b3
		
		$('#b4').click(function() {
			$.ajax({
				url: "json4.jsp",
				dataType: "json",
				success: function(json) {
					high1 = json[0].yd_high
					low1 = json[0].yd_low
					end1 = json[0].yd_end
	
					high2 = json[1].td_high
					low2 = json[1].td_low
					end2 = json[1].td_end
					
					$('#result').append("어제 주가: " + high1 + " " + low1 + " " + end1 + "<br>")
					$('#result').append("어제 주가: " + high2 + " " + low2 + " " + end2 + "<br>")
				} // success
			}) // ajax
		}) // b4
	}) // $
</script>
</head>
<body>
<button id="b1">JSON을 받아오자.!</button>
<button id="b2">JSONArray를 받아오자.!</button>
<button id="b3">JSON3을 받아오자.!</button>
<button id="b4">JSONArray4를 받아오자.!</button>
<hr color="red">
<div id="result"></div>
</body>
</html>