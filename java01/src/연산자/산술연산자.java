package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술연산자(사칙연산자, + - * / % : 나머지)
		int x = 20;
		int y = 10;

		// 컨트롤 + 알트 + 화살표 아래 (한줄복사)
		// 하나라도 문자열이면 +는 결합의 기능, 결합연산자
		// 괄호안에 먼저 넣어주면 먼저 연산 해 줌
		System.out.println("더한 값은 " + (x + y));
		System.out.println("뺀 값은 " + (x - y));
		System.out.println("곱한 값은 " + (x * y));
		System.out.println("나눈 값은 " + (x / y));
		System.out.println("나머지 값은 " + (x % y));
	}

}
