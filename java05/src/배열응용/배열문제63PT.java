package 배열응용;

import java.util.Scanner;

public class 배열문제63PT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 정수를 입력받아서 배열에 넣자.
		int[] jumsu = new int[5];
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("정수입력>> ");
			jumsu[i] = sc.nextInt();
		}
		System.out.println(jumsu[0] + jumsu[2]);

		// 2. 문자열을 입력받아서 배열에 넣자.
		String[] words = new String[3];
		for (int i = 0; i < words.length; i++) {
			System.out.print("과목입력>> ");
			words[i] = sc.next();
		}
		System.out.println(words[0] + "보다는 " + words[1]);
		sc.close();
	}
}
