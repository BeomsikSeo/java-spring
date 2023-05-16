package 조건문;

import java.util.Date;

public class IF문4 {

	public static void main(String[] args) {
		//Date - 년월일시분초, java.util.date (sql 에도 있는데 이거 쓰면 안됨! 주의!)
		Date date = new Date();
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		System.out.println(date.getYear() + 1900); // 1900년부터 몇년 지났는지 세줌
		System.out.println(date.getMonth() + 1); // 음력이라 항상 월에는 1을 더해주어야 함
		System.out.println(date.getDate());
		
		System.out.println(date.getDay()); // 요일! 0부터 시작, 일요일!!
		
		int hour = date.getHours(); // 옛날 부품이라 취소선이 들어감. 최신 부품이 따로 있음
		//int hour = 15;
		
		if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 14) {
			System.out.println("굿에프터눈");
		} else if (hour < 20) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
		
		//int month = 2;
		
		int month = date.getMonth() + 1; // 옛날 부품이라 취소선이 들어감. 최신 부품이 따로 있음
		System.out.println(month);
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
	}

}
