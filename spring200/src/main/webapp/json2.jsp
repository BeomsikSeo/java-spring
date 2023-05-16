<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
// 스크립트릿
	JSONObject json = new JSONObject();
	json.put("name", "hong1"); // {name : hong}
	json.put("age", 1001);
	json.put("id", "apple1");
	
	JSONObject json2 = new JSONObject();
	json2.put("name", "song"); // {name : hong}
	json2.put("age", 200);
	json2.put("id", "song");

	JSONArray array = new JSONArray();
	array.add(json);
	array.add(json2);
	
	// out.print(json.toJSONString());
%><%= array.toJSONString()  %>