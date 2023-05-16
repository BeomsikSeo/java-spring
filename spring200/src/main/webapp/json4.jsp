<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
// 스크립트릿
	JSONObject json = new JSONObject();
	json.put("yd_high", 25000); // {name : hong}
	json.put("yd_low", 22500);
	json.put("yd_end", 23600);
	
	JSONObject json2 = new JSONObject();
	json2.put("td_high", 24250); // {name : hong}
	json2.put("td_low", 21900);
	json2.put("td_end", 23500);

	JSONArray array = new JSONArray();
	array.add(json);
	array.add(json2);
	
	// out.print(json.toJSONString());
%><%= array.toJSONString()  %>