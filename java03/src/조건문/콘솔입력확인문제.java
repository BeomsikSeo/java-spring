package 조건문;

import java.util.Scanner;

public class 콘솔입력확인문제 {

	public static void main(String[] args) {
		// Scanner를 사용하여
		// 1. id와 pw를 입력해서
		// id가 root이고,
		// pw가 1234이면 로그인 성공!
		// 아니면 로그인 실패!
		
		// 2. 사과 구매 갯수, 사과 한 개당 가격 입력
		// 딸기 구매 갯수, 딸기 한 개당 가격입력
		// 다음과 같이 출력
		// 사과 구매 가격은 5500원입니다.
		// 딸기 구매 가격은 4500원입니다.
		// 전체 구매 가격은 10000원입니다.
		
		// 3. 심화문제
		// 시작값, 종료값 입력
		// 시작값부터 종료값까지 모두 더해서 출력
		
		// 4. 심화문제
		// 시작값, 종료값, 점프값 입력
		// 시작값부터 종료값까지 점프값만큼 증가하면서 더함. 더한 값을 출력
		// 더한 값이 100을 넘으면 프로그램 종료
		
		// 1)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("id를 입력하세요 >> ");
		String id = sc.next();
		System.out.print("pw를 입력하세요 >> ");
		int pw = sc.nextInt();
		
		String result = "";
		
		if (id.equals("root") && pw == 1234) {
			result = "로그인 성공!";
		}  else {
			result = "로그인 실패!";
		}
		
		System.out.println(result);
		
		System.out.println();
		
		// 2)
		System.out.print("사과 구매 갯수 입력 ");
		int apCount = sc.nextInt();
		System.out.print("사과 한 개당 가격 입력 ");
		int apPrice = sc.nextInt();
		System.out.print("딸기 구매 갯수 입력 ");
		int sbCount = sc.nextInt();
		System.out.print("딸기 한 개당 가격 입력 ");
		int sbPrice = sc.nextInt();
		
		int resultAp = apCount * apPrice;
		int resultSb = sbCount * sbPrice;
		
		System.out.println("사과 구매 가격은 " + resultAp + "원입니다.");
		System.out.println("딸기 구매 가격은 " + resultSb + "원입니다.");
		System.out.println("전체 구매 가격은 " + (resultAp + resultSb) + "원입니다.");
		
		// 3)
		
		
		sc.close();

	}

}
