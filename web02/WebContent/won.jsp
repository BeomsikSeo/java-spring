<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String won = request.getParameter("won");
    	int won2 = Integer.parseInt(won);
    	int dollar = 1282;
    	int result = won2 / dollar;
    %><%= result %>