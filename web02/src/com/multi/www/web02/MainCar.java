package com.multi.www.web02;

public class MainCar {

	public static void main(String[] args) {
		Car car; // 12개의 메모리 (참조형 4byte, int 각각 4byte)
		for (int i = 0; i < 1000; i++) {
			car = new Car("빨강" + i, 10, 200);
			System.out.println(car); // 주소확인!
		}
		System.out.println("메모리크기>> " + 12 * 1000);

	}

}
