<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=c46e48432459bb481372f3373aa74b6d"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		 $('#b1').click(function() {
			$.ajax({
				url: "jsonResponse3",
				dataType: "json",
				success: function(json) {
					id = json.id  // dataType 넣어줬으면 .키 로 값을 읽어옴
					pw = json.pw
					name = json.name
					tel = json.tel // json에서 tel키로 값을 추출
					table = "<table><tr><td>항목명</td><td>값</td></tr>" +
					"<tr><td>아이디</td><td>" + id + "</td></tr>" +
					"<tr><td>패스워드</td><td>" + pw + "</td></tr>" +
					"<tr><td>이름</td><td>" + name + "</td></tr>" +
					"<tr><td>전화번호</td><td>" + tel + "</td></tr></table>"
					$('#result').append(table)
				} // function
			}) // ajax
		}) // b1
		
		 $('#b2').click(function() {
			 	$('#result').empty()
				$.ajax({
					url: "jsonResponse4",
					dataType: "json",
					success: function(json) {
						id = json[0].id  // dataType 넣어줬으면 .키 로 값을 읽어옴
						pw = json[0].pw
						name = json[0].name
						tel = json[0].tel // json에서 tel키로 값을 추출
						table = "<table><tr><td>항목명</td><td>값</td></tr>" +
						"<tr><td>id1</td><td>" + id + "</td></tr>" +
						"<tr><td>pw1</td><td>" + pw + "</td></tr>" +
						"<tr><td>name1</td><td>" + name + "</td></tr>" +
						"<tr><td>tel1</td><td>" + tel + "</td></tr></table>"
						
						id1 = json[1].id  // dataType 넣어줬으면 .키 로 값을 읽어옴
						pw1 = json[1].pw
						name1 = json[1].name
						tel1 = json[1].tel // json에서 tel키로 값을 추출
						list = "<ul><li>id2 : " + id1 + "</li>" +
						"<li>pw2 : " + pw1 + "</li>" +
						"<li>name2 : " + name1 + "</li>" +
						"<li>tel2 : " + tel1 + "</li></ul>"
						$('#result').append(table + list)
					} // function
				}) // ajax
			}) // b2
			
			 $('#b3').click(function() {
					$.ajax({
						url : "jsonResponse5",
						dataType : "json",
						success : function(json) {
							lat = json.lat
							lon = json.lon

							var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
							mapOption = {
								center : new kakao.maps.LatLng(lat,lon), // 지도의 중심좌표
								level : 3
							// 지도의 확대 레벨
							};

							var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

							// 마커가 표시될 위치입니다 
							var markerPosition = new kakao.maps.LatLng(lat, lon);

							// 마커를 생성합니다
							var marker = new kakao.maps.Marker({
								position : markerPosition
							});

							// 마커가 지도 위에 표시되도록 설정합니다
							marker.setMap(map);
						} //success
					}) // ajax
				}) // b3

				$('#b4').click(function() {
					  google.charts.load('current', {'packages':['corechart']});
				      google.charts.setOnLoadCallback(drawChart);

				      function drawChart() {
				    	  //alert("function");
				    	  $.ajax({
								url : "jsonResponse6",
								dataType : "json",
								success : function(list) {
									alert(list[0].work + " " + list[0].time)
									//2차원 배열--> 3개
									var arr2 = new Array(list.length + 1);
								    var header = ["Task", "hours"];
								    arr2[0] = header
								    //alert(data[0])
			                    	/* for(i = 0; i < list.length; i++){
								    	data[i + 1] = new Array(2)
								    	data[i + 1][0] = list[i].work;
								    	data[i + 1][1] = list[i].time;
										alert(arr2[i + 1])
									} */
									//2차원배열은 배열을 만들어서
									//1차원을 2차원배열에 하나씩 끼면 됨.
									for(i = 0; i < list.length; i++){
								    	one = new Array(2)
								    	one[0] = list[i].work;
								    	one[1] = list[i].time;
								    	arr2[i + 1] = one
									}
							        var data = google.visualization.arrayToDataTable(arr2);
							         /* [
							        	 	['Task', 'Hours per Day'], //인덱스0
							          		[list[0].work, list[0].time], //인덱스1
							          		[list[1].work, list[1].time], //인덱스2
							          		[list[2].work, list[2].time] //인덱스3
							        	 ]*/
							
							        var options = {
							          title: 'My Daily Activities'
							        };
							
							        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
							
							        chart.draw(data, options);
							}//success
				    	  })//ajax
						}//function
				}) // b4
	}) // $
</script>
</head>
<body>
<button id="b1">MemberVO의 내용을 json으로 받아오기(table)</button>
<button id="b2">MemberVO 리스트를 출력(list, table)</button>
<button id="b3">카카오맵에 json을 넣어 지도를 표시</button>
<button id="b4">구글차트에 json을 넣어 차트를 표시</button>
<hr color="blue">
<div id="result"></div>
<div id="map" style="width:100%;height:350px;"></div>
<div id="piechart" style="width: 900px; height: 500px;"></div>
</body>
</html>