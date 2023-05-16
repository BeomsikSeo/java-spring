package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("이름 입력 >> ");
		String data = sc.next();
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		System.out.print("취미 입력 >> ");
		String hb = sc.next();
		System.out.println();
		
		System.out.println("나의 이름은 " + data);
		System.out.println("나의 나이는 " + age);
		System.out.println("나의 취미는 " + hb);
		
		sc.close();

	}

}
