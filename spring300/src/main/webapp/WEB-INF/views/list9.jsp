<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
td{
	width: 100px;
	text-align: center;
}
.top{
	background: black;
	color: white;
}
.down{
	background: lime;
}
</style>
</head>
<body>
<!-- 표현식(expression) -->
북마크 전체 검색 요청이 완료되었습니다. <br>
<%-- 
<%
MemberVO bag = (MemberVO)request.getAttribute("bag");
%>
<%= bag.getId() %> 
--%>
<!-- for (String s : list) {
		}
 -->
<table>
<tr>
	<td class="top">brand</td>
	<td class="top">name</td>
	<td class="top">code</td>
	<td class="top">company</td>
</tr>
<c:forEach items="${list}" var="bag">
<!-- bag.getId() -->
<!-- model의 속성으로 전달받은 bag은 EL로 출력한다 -->
<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.! 라는 의미! -->
<tr class="down">
	<td>${bag.drug_brand}</td><!-- 출력용(expression language - EL) -->
	<td>
		<a href="one3.multi?code=${bag.code}">${bag.drug_name}</a>
	</td>
	<td>${bag.code}</td>
	<td>${bag.company}</td>
</tr>
</c:forEach>
</table>
</body>
</html>