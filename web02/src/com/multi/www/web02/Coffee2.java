package com.multi.www.web02;

public class Coffee2 {
	int price = 2000;
	String name = "아메리카노";
	public static Coffee2 coffee2;
	
	public static Coffee2 getInstance() {
		if (coffee2 == null) {
			coffee2 = new Coffee2();			
		}
		return coffee2;
	}
	
	private Coffee2() {
	}
		
}
