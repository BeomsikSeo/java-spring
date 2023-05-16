package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {
//		int target = 77;
		Random r = new Random();
		int target = r.nextInt(100);
		Scanner sc = new Scanner(System.in);
		
		int data = 0;
		int count = 0;
		while (true) {
			System.out.print("생각한 정답은?? ");
			data = sc.nextInt();
			count++;
			if (data == target) {
				System.out.println("정답입니다.");
				System.out.println("당신의 시도 횟수는 " + count);
				System.out.println("프로그램을 종료합니다.");
				break;
			} // else {
//				System.out.println("오답입니다.");
//				System.out.println("다시 시도해주세요.");
				
				// 1. 오답인 경우 힌트주세요
				// data가 target보다 크면 "너무 커요"
				// data가 target보다 작으면 "너무 작아요"
			else if (data > target) {
				System.out.println("오답입니다.");
				System.out.println("다시 시도해주세요");
				System.out.println("너무 커요");
			} else {
				System.out.println("오답입니다.");
				System.out.println("다시 시도해주세요");
				System.out.println("너무 작아요");
			}
				
				// 2. 랜덤을 이용해서 프로그램 실행될 때마다 정답을 바꿔주세요
				
				// 3. 전체 시도 횟수 카운트해서 프린트
			
			
			// } 
		}
		sc.close();
	}

}
