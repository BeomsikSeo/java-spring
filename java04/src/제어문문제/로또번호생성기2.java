package 제어문문제;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 ==> Random
		// r.nextInt(45) : 0~44
		// 가짜 랜덤한 만들어주는 부품
		Random r = new Random(); // 씨앗값, seed값!
		// ()를 비워두면 랜덤값 출력
		// ()안에 숫자를 넣으면 고정값이 나옴 - 씨앗값, seed값
		
		// 2 ~ 10
		
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(9) + 2));
			// 0~8 => +2 => 2~10
		}
		
		// 3 ~ 30
		
		for (int i = 0; i < 10; i++) {
			System.out.println("로또 번호 : " + (r.nextInt(28) + 3));
			// 0~27 => +3 => 3~30
		}
	}

}
