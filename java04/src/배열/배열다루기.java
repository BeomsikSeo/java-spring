package 배열;

public class 배열다루기 {

	//코드 정리 ==> 컨트롤 + 쉬프트 + f
	public static void main(String[] args) {
		int[] x = new int[10]; // length : 10
								// 저장공간이 실제로는 12개 만들어짐
								// x라는 변수 1, 배열 10, length 1
		// index는 0부터 시작, 마지막 위치의 인덱스는 10보다 1 작음.
		// 0~9
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}

//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);

		System.out.println("");
		System.out.println("");
		// 우리가족의 성별을 char[]로 저장, 프린트
		char[] gender = { '남', '여', '남', '남' };

		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}

		System.out.println("");
		// 우리가족의 이름을 String[]로 저장, 프린트
		String[] name = { "홍길동", "김삼순", "홍철수", "홍영희" };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		System.out.println("");
		// 우리가족의 시력을 double[]로 저장, 프린트
		double[] eye = { 1.2, 1.5, 0.9, 2.0 };

		for (int i = 0; i < eye.length; i++) {
			System.out.println(eye[i]);
		}

		System.out.println("");
		// 우리 가족이 점심을 먹었는지 boolean[]로 저장, 프린트
		boolean[] eat = { true, false, true, true, true };

		for (int i = 0; i < eat.length; i++) {
			System.out.println(eat[i]);
		}

	}

}
