<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 브라우저가 보낸 데이터를 받아야 함. ==> 자바로 짜야함. -->
    <!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품 필요함. -->
    <% //스크립트릿 - 조금 코드를 써서 만드는 작은 프로그램 (릿 : 작은 프로그램)
    //자바코드 넣는 부분!!
    //HttpServletRequest request = new HttpServletRequest();
    //tomcat은 미리 request를 만들어서 내장시켜놨어요!
    String id = request.getParameter("id"); //"apple"
    
    // 가방을 만들어서 값들을 넣고!
    // jsp에서 자동Import - 해당클래스 클릭한 다음 컨트롤 + 쉬프트 + M
/*     MemberVO bag = new MemberVO();
    bag.setId(id); */
    
    // dao에게 가방을 전달하자.!
    MemberDAO3 dao = new MemberDAO3();
    dao.delete(id);
    
    
    %>
    <!-- 3. 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: lime;
}
</style>
</head>
<body>
회원탈퇴 요청되었음.
<hr color = "red">
탈퇴한 id : <%= id %> <br>

</body>
</html>