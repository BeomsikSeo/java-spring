package 형변환;

import java.util.ArrayList;

public class 형변환확인문제 {
	
	public static void main(String[] args) {
		
		ArrayList me = new ArrayList();
		me.add(1000); // Object <- Integer (업캐스팅) <- int (오토박싱)
		me.add(189.1); // Object <- Double <- double
		me.add(false); // Object <- Boolean <- boolean
		me.add('남'); // Object <- Character <- char
		
		// ArrayList는 toString()이 재정의
		// me라는 참조형이기 때문에 me를 프린트하면 주소!가 프린트
		// toString()이 재정의한 내용은 주소가 가리키는 값들을 String으로 만들어주도록 정의함.
		// me를 찍어보면 주소대신 String으로 만든 내용이 출력
		
		System.out.println(me);
		
		int money = (Integer)me.get(0); // int <- Integer <- Object
		System.out.println(money + 1000);
		
		double height = (Double)me.get(1); // double <- Double <- Object
		System.out.println(height + 10);
		
		boolean eat = (Boolean)me.get(2); // boolean <- Boolean <- Object
		if (eat) { // 결과값이 boolean 이므로 그대로 넣어줘도 상관없음
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		
		char gender = (Character)me.get(3); // char <- Character <- Object
		if (gender == '남') {
			System.out.println("주민번호는 1, 3이에요");
		} else {
			System.out.println("주민번호는 2, 4이에요");
			
		}
		
		// 2번 순서
		// int <-- Integer (오토언박싱) <-- Object (다운캐스팅, 강제형변환)
		
		// 3번 순서
		// double <-- Double (오토언박싱) <-- Object (다운캐스팅, 강제형변환)
		
	}

}
