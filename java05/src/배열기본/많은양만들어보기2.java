package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		
		int[] jumsu2 = new int[1000];
		
		Random r = new Random();
		
		// 2부터 20까지 임의로 만들어서
		// ==> r.nextInt(19) + 2;
		// ==> 0~18 + 2 ==> 2~20
		// 배열에 넣어보세요.!
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2;
		}
		
		
		// 전체 프린트
		for (int x : jumsu2) {
			System.out.println(x);
		}
		
		System.out.println("");
		
		// 3 이상인 숫자 몇 개인지 프린트
		// 배열은 전체를 가지고 와서, 3 이상인지 체크
		// 갯수를 세주세요.
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < jumsu2.length; i++) {
			if (jumsu2[i] >= 3) {
				count++;
			} else {
				count2++;
			}
		}
		System.out.println("3이상은 " + count);
		System.out.println("3미만은 " + count2);

	}

}
