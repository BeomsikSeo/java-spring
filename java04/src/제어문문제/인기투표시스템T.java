package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템T {

	public static void main(String[] args) {
		// ==>int iu = 0;
		// ==>누적시키는 변수는 반복문안에 넣지 않는다.!!
		// ==>new Scanner() 반복문 안에 넣지 않는다.
		// ==>영화예매좌석 new JButton(); 반복문 안에 넣는다.
		// ==>입력값 4인지 체크해주는 코드?? 위치가?? 조건문안에 첫번째 조건으로!!
		//
		// 인기투표 시스템
		// ===========
		// 1)아이유 2)방탄 3)뉴진스 4) 종료 >> 1
		// 1)아이유 2)방탄 3)뉴진스 4) 종료 >> 2
		// 1)아이유 2)방탄 3)뉴진스 4) 종료 >> 4
		// 시스템을 종료합니다.
		// -----------------
		// 아이유 1표
		// 방탄 2표
		// 뉴진스 0표
		// -----------------
		int iu = 0, bts = 0, newjeans = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("인기투표 시스템\n===============");
		while (true) {
			System.out.print("1)아이유 2)방탄 3)뉴진스 4) 종료 >> ");
			int choice = sc.nextInt(); // "2" --> 2
			if (choice == 4) {
				System.out.println("시스템을 종료합니다.");
				break; //
			} else if (choice == 1) {
				iu++;
			} else if (choice == 2) {
				bts++;
			} else if (choice == 3) {
				newjeans++;
			} else { //
				System.out.println("해당 번호가 없습니다.");
			}
		}
		sc.close();

		System.out.println("\n===> 1)아이유: " + iu + "표, 2)방탄: " + bts + "표, 3)뉴진스: " + newjeans + "표");
	}

}
