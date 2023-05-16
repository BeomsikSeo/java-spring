package com.multi.www.web02;

public class Car2 {
	// 멤버변수
	// 멤버메서드
	// toString()
	// 객체 생성 시 멤버변수값을 한꺼번에 넣어서 초기화하고 싶어요!
	// -> 객체 생성 시 자동호출되는 메서드를 추가해주세요.
	// -> 생성자(메서드), constructor
	String color;
	int price;
	int speed;
	// 하나만 제공하는 객체는
	// static : 하나만 변수만들때
	// public : 제공하는 car2를 아무데서나 쓸 수 있도록!
	public static Car2 car2; // Null
	
	// 싱글톤은 해당클래스에서 하나만 만들어서 제공!
	
	public static Car2 getInstance() {
		// 아직 만들지 않았다면
		if(car2 == null) { // 아직 안만들어진 것!
		car2 = new Car2("빨강", 100, 110);
		}
		return car2;
	}
	
	public void run() {
		System.out.println("달리자~~~~~~~~~~!!!!!!!!!!!!!!!!.");
	}
	
	// new이용해서 객체생성시 new Car2()를 외부에서
	// 부를 수 없도록 해당 클래스내에서만 부르게 하고
	// 싶은 경우는 접근제어자를 private으로 바꾸어버리자.!!
	private Car2(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
}
