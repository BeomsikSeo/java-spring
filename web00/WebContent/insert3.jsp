<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    <!-- 1. 전달된 값 받아주세요. (request이용)  -->
    <!-- 2. dao에게 값 전달. (DAO 이용) -->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요. -->
    <%
    	// 0. 클라이언트가 입력한 정보를 받아주세요.!
    	/* String id = request.getParameter("id");
    	String name = request.getParameter("name");
    	String content = request.getParameter("content");
    	String price = request.getParameter("price");
    	String company = request.getParameter("company");
    	String img = request.getParameter("img"); */
    	
    	// 1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자.!
    	/* ProductVO bag = new ProductVO();
    	bag.setId(id);
    	bag.setName(name);
    	bag.setContent(content);
    	bag.setPrice(Integer.parseInt(price));
    	bag.setCompany(company);
    	bag.setImg(img); */
    	
    	// 2. dao에게 가방을 전달하면서 insert해달라고 하자.!
    	ProductDAO dao = new ProductDAO();
    	dao.insert(bag);
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
상품 id : <%= bag.getId() %> <br>
상품 이름 : <%= bag.getName() %> <br>
상품 설명 : <%= bag.getContent() %> <br>
상품 가격 : <%= bag.getPrice() %> <br>
상품 회사 : <%= bag.getCompany() %> <br>
상품 사진  <br>
<!-- img src=img/shoes1.jpg -->
<img src="img/<%= bag.getImg() %>" width=200 height=200>
</body>
</html>