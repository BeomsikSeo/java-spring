package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		// 비교연산자(==, !=, >, >=)
		// *** 비교 결과가 중요(결과가 반드시 논리형 데이터!! true/false)
		int x = 20;
		int y = 10;

		// 컨트롤 + 알트 + 화살표 아래 (한줄복사)
		System.out.println("같은지 비교 " + (x == y));
		System.out.println("같지 않은지 비교 " + (x != y));
		System.out.println("큰지 비교 " + (x > y));
		System.out.println("크거나 같은지 비교 " + (x >= y));
	}

}
