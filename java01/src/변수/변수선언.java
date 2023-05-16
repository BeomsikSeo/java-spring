package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// 자바는 변수를 만들 때, 어떤 타입의 데이터를 넣을 것인지 미리 결정
		// 선언!! 타입 변수명 !! ==> 저장공간(ram)에 변수가 생성됨
		// 기본 데이터 => 정수, 실수, 문자1, 논리
		int num = 100; // 정수변수
		double num2 = 22.2;	//실수변수 22.0 = 22 (정수를 포함하고 있는 개념)
		char c = '한'; //글자1글자 ==> '' , 여러글자 넣을 수 없음
		boolean b = true; // false
		num = 200; //ok!!
		//b = 300; 이건 안 됨 글자만 넣기로 이미 생성
		System.out.println("정수값은 " + num);
		System.out.println("실수값은 " + num2);
		System.out.println("문자 1개 값은 " + c);
		System.out.println("부울렌 값은 " + b);

	}

}
