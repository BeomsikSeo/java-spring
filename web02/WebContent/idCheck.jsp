<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    // 입력한값 받아오기.
    String id = request.getParameter("id");
    
    // 입력한 id가 배열에 있는지 확인.
    String[] list = {"root", "admin", "hong"};
    
    String result = "중복이 되지 않아, 사용 가능";
    
    // 결과를 응답하자.
    for (String s : list) {
    	if (s.equals(id)) {
    		result = "중복된 id이므로, 사용 불가능";
    		break;
    	}
    }
    %><%= result %>
