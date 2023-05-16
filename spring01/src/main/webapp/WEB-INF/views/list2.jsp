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
게시판 전체 검색이 완료되었습니다. <br>
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
	<td class="top">no</td>
	<td class="top">title</td>
	<td class="top">content</td>
	<td class="top">writer</td>
</tr>
<c:forEach items="${list}" var="bag">
<!-- bag.getId() -->
<!-- model의 속성으로 전달받은 bag은 EL로 출력한다 -->
<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.! 라는 의미! -->
<tr class="down">
	<td>${bag.no}</td><!-- 출력용(expression language - EL) -->
	<td>
		<a href="one2.multi?no=${bag.no}">${bag.title}</a>
	</td>
	<td>${bag.content}</td>
	<td>
		<a href="one?id=${bag.writer}">${bag.writer}</a>
	</td>
</tr>
</c:forEach>
</table>
</body>
</html>