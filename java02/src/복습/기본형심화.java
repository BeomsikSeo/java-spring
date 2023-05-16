package 복습;

public class 기본형심화 {

	public static void main(String[] args) {
		// 기본형 4가지
		// 정수,  실수,  문자,   논리
		// int double char boolean
		double temp = 1.2; // 세미콜론(끝의 의미!) 생략 불가! 반드시 써야함!
		int floor = 3;
		char color = 'b';
		boolean juice = false;
		
		String location = "선릉역";
		
		// sysout 컨트롤 + 스페이스(윈도우) : 자동완성
		// 망치처럼 자주 사용하는 부품은 대문자로 바로 씁니다.!!
		// System - 컴퓨터, out(출력장치) - 모니터
		//                 in(입력장치) - 키보드
		System.out.println("오늘 온도는 " + temp + "도");
		System.out.println("현재 층은 " + floor + "층");
		System.out.println("오늘의 색은 " + color + "색");
		System.out.println("오늘 쥬스는 " + juice);
		System.out.println("오늘 도착한 역은 " + location);

	}

}
