package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		// Scanner 부품 써보자!
		// console 에서 입력한 값 java로 가져올 때 사용
		// 통로가 생성되어 강물처럼 한 방향으로만 흐름 (console -> java)
		// 통로를 없앨 때 까지 계속 생성되어 있으므로 반드시 없애겠다고 해야함.
		Scanner sc = new Scanner(System.in); // 컴퓨터.키보드
		// 자바프로그램과 콘솔간에 통로를 만든다.
		// 연결통로 == 강물(스트림, Stream)
		// Stream은 내가 닫아주지 않으면 계속 가지고 있게 됨.(자원낭비임)
		// Stream을 반드시 닫아주자!!
		
		System.out.print("요일 입력: 주중1) 주말2)");
		int data = sc.nextInt(); // String --> int로 바꿔줌		
		if (data == 1) {
			System.out.println("열심히 달리자.");
		} else {
			System.out.println("푹~~쉬자.");
		}
		
		System.out.print("주말에 뭐할까?");
		String data2 = sc.next(); // 단어, 문자열
		System.out.println("나는 주말에 " + data2 + "를 할거야.");
		sc.close();

	}

}
