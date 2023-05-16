package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// 내 정보중 기본 데이터에 속하는 정보를 변수에 넣고, 출력해보세요.!
		// 정수
		// 실수
		// 문자1 (문자 1글자만 기본데이터임)
		// 논리
		// 프린트해보세요.!!
		int height = 181;
		double eye = 1.5;
		char firstName = '서';
		boolean gender = true;
		
		// 1글자 이상 문자는 기본데이터 X ==> 너무 많이 쓰기 때문에 기본형처럼 사용 가능!!
		String name = "홍길동"; // 여러글자를 쓸때는 ""
		//스트링, 실!!, 문자열!!
		
		System.out.println("내 키는 " + height);
		System.out.println("내 시력은 " + eye);
		System.out.println("내 성은 " + firstName);
		System.out.println("내 젠더는 " + gender);
		System.out.println("나의 이름은 " + name);
	}

}
