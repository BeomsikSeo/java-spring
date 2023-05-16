package 배열응용;

import java.util.Scanner;

public class 배열문제63P {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1) 정수 5개 크기의 배열을 만들어서
		// 10, 20, 30, 40, 50을 순서대로 넣는다.
		// 첫번째값과 세번째값을 더해서 프린트
		int[] z = new int[5];

		System.out.println("10, 20, 30, 40, 50을 순서대로 넣으세요");
		for (int i = 0; i < z.length; i++) {
			z[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("첫번째와 세번째 값의 합계는 " + (z[0] + z[2]));
		System.out.println();
		// 2) 스트링 3개 크기의 배열을 만들어서
		// 자바, 스프링, JSP를 순서대로 넣는다.
		// => "자바 보다는 스프링"로 출력
		// scanner로 입력받기
		String[] x = new String[3];

		System.out.println("자바, 스프링, JSP를 순서대로 넣으세요");
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.next();
		}
		System.out.println();
		System.out.println(x[0] + "보다는 " + x[1]);

		sc.close();

	}

}
