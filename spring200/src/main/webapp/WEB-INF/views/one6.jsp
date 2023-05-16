<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 표현식(expression) -->
게시물정보입니다. <br>
<%-- 
<%
MemberVO bag = (MemberVO)request.getAttribute("bag");
%>
<%= bag.getId() %> 
--%>
<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.! 라는 의미! -->
<!-- bag.getId() -->
<!-- model의 속성으로 전달받은 bag은 EL로 출력한다 -->
${bag.no} <br><!-- 출력용(expression language - EL) -->
${bag.title} <br>
${bag.content} <br>
${bag.writer} <br>