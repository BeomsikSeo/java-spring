package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// 여러개의 데이터를 RAM에 저장해두고 CPU가 접근하여 사용하고
		// 싶은 경우 사용하는 부품
		// 1. 값을 이미 알고 있는 경우
		int[] score = {10, 20, 30, 40}; // leng라는 변수가 마지막에 자동으로 만들어져서
		                  // 값이 몇개인지 세서 값을 넣어줌.
		System.out.println(score);
		System.out.println(score[0]); // 첫번째값.
		System.out.println(score[1]); // 두번째값.
		System.out.println(score[2]); // 세번째값.
		System.out.println(score[3]); // 네번째값.
		System.out.println("전체 개수: " + score.length); // 이 주소가 가리키는 length변수.

		score[0] = 100; // 첫번째값으로 100을 넣으세요. 10<--100
		System.out.println(score[0]);
		
		// 2. 값을 아직 모르지만 먼저 저장공간 만들어두고
		// 나중에 값을 넣는 경우
		int[] score2 = new int[4];
		score2[0] = 200;
		System.out.println(score2[0]);
		System.out.println(score2[3]);
	}

}
