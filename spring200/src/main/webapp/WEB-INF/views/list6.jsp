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
		<td class="top">no</td>
		<td class="top">bbsno</td>
		<td class="top">content</td>
		<td class="top">writer</td>
	</tr>
	<c:forEach items="${list}" var="bag">
		<!-- bag.getId() -->
		<!-- model의 속성으로 전달받은 bag은 EL로 출력한다 -->
		<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.! 라는 의미! -->
		<tr class="down">
			<td>${bag.no}</td>
			<!-- 출력용(expression language - EL) -->
			<td>${bag.bbsno}</td>
			<td>${bag.content}</td>
			<td>${bag.writer}</td>
		</tr>
	</c:forEach>
</table>