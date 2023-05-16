package 복습;

public class 자바연산시주의점 {

	public static void main(String[] args) {
		// 자바 연산시 주의점
		int x = 20; // 컨트롤 + 알트 + 화살표 아래
		int y = 30; // 컨트롤 + 알트 + 화살표 아래

		System.out.println(x / y);
		// 소숫점까지 구하고 싶은 경우에는 X
		// 정수와 정수의 계산은 무조건 정수!!
		// 계산시 하나라도 실수이면 결과는 무조건 실수!!
		
		int x2 = 20;
		double y2 = 30; // 30.0, 30(double에 정수를 넣을 수 있음)
		System.out.println(x2 / y2);
		
		// 이미 정수로 저장된 값을 cpu가 가져다가 실수 연산을 하고 싶은 경우
		// cpu가 정수를 실수로 변환해서 할 수 있음!!
		// 강제타입변환(강제형변환) == (강제로 바꾸고 싶은 타입)변수명;
		System.out.println(x / (double)y);
	}

}
