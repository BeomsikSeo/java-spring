package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 ==> Random
		// 가짜 랜덤한 만들어주는 부품
		Random r = new Random(100); // 씨앗값, seed값!
		// ()를 비워두면 랜덤값 출력
		// ()안에 숫자를 넣으면 고정값이 나옴 - 씨앗값, seed값
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + r.nextInt(10)); // 0~9
		}
		// 블럭 잡고 마우스 오른쪽 -> surround wiht -> for문 선택
		// 이렇게도 됨
	}

}
