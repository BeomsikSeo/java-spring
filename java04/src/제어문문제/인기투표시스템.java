package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {
		// 1) 아이유 2) 방탄 3) 뉴진스 4) 종료 >> 1
		// 1) 아이유 2) 방탄 3) 뉴진스 4) 종료 >> 2
		// 1) 아이유 2) 방탄 3) 뉴진스 4) 종료 >> 4
		// 시스템을 종료합니다
		
		// 아이유 1표
		// 방탄 2표
		// 뉴진스 1표
		
		// 1. 입력받기
		// 2. 처리하여 결과 표출
		// 3. 반복 삽입
		
		// ==> 누적시키는 변수는 반복문안에 넣지 앟는다.!!
		//     ex) int iu = 0; 등
		// ==> new Scanner() 반복문 안에 넣지 않는다. (반복되지 않음)
		// ==> 영화예매좌석 new JButton(); 반복문 안에 넣는다.
		// ==> 입력값 4인지 체크해주는 코드?? 위치가?? 조건문안에 첫번째 조건으로!!
		//     처음에 나와야 다른 것들을 체크하지 않음. 마지막이면 처음부터 쭉 검사함
		// 이런 어디에 변수가 있어야되는지 등을 잘 판단할 것!
		
		Scanner sc = new Scanner(System.in);
		
		int iu = 0; // 아이유 누적 횟수
		int bts = 0; // 방탄 누적 횟수
		int jin = 0; // 뉴진스 누적 횟수
		
		System.out.println("인기투표 시스템");
		System.out.println("인기투표 시스템\n=================");
		// 이렇게 중간에 \n 넣으면 엔터 효과 (역슬래쉬)
		System.out.println("========================");
		
		while (true) {
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >> ");
			int data = sc.nextInt();
			if (data == 4) {
				System.out.println("시스템을 종료합니다.");
				break;
			} else if (data == 1) {
				iu++;
			} else if (data == 2) {
				bts++;
			} else if (data == 3){
				jin++;
			}
		}
		
		System.out.println("----------------------");
		
		System.out.println("아이유 " + iu + "표");
		System.out.println("방탄 " + bts + "표");
		System.out.println("뉴진스 " + jin + "표");
		
		System.out.println("----------------------");
		
		sc.close();
	}

}
