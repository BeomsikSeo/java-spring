<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 표현식(expression) -->
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
		<td class="top">id</td>
		<td class="top">pw</td>
		<td class="top">name</td>
		<td class="top">tel</td>
	</tr>
	<c:forEach items="${list}" var="bag">
		<!-- bag.getId() -->
		<!-- model의 속성으로 전달받은 bag은 EL로 출력한다 -->
		<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.! 라는 의미! -->
		<tr class="down">
			<td>${bag.id}</td>
			<!-- 출력용(expression language - EL) -->
			<td>${bag.pw}</td>
			<td>${bag.name}</td>
			<td>${bag.tel}</td>
		</tr>
	</c:forEach>
</table>