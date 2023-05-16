<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><% 
	// ajax(비동기통신), a, form, location.href(동기통신)는 모두
	// 브라우저가 http로 만들어서 서버에 요청하는 것!!
	String won = request.getParameter("won");
	int won2 = Integer.parseInt(won);
	int dollar = 1283;
	int result = won2 / dollar;
%><%= result %>