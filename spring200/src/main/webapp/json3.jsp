<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
// 스크립트릿
	JSONObject json = new JSONObject();
	json.put("weather", "rain"); // {name : hong}
	json.put("temp", 15);
	json.put("humid", 100);
	
	// out.print(json.toJSONString());
	
%><%= json.toJSONString()  %>