package 배열;

public class 배열다루기T {

	// 코드 정리 ==> 컨트롤 + 쉬프트 + f
	public static void main(String[] args) {
		int[] x = new int[10]; // legnth: 10
		// index는 0부터 시작, 마지막 위치의 인덱스는 10보다 작음.
		// 0~9
		System.out.println(x.length);
		x[0] = 10;
		x[1] = 20;
		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
//			System.out.println(x[0]);
//			System.out.println(x[1]);
//			System.out.println(x[2]);
		System.out.println();
		// 우리가족의 성별을 char[]로 저장, 프린트
		char[] gender = { '남', '여', '여', '여' };
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		// 우리가족의 이름을 String[]로 저장, 프린트
		String[] names = { "홍길동", "김길동", "홍길순", "홍길정" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// 우리가족의 시력을 double[]로 저장, 프린트
		double[] eyes = { 1.0, 0.5, 0.9, 1.5 };
		for (int i = 0; i < eyes.length; i++) {
			System.out.print(eyes[i] + " ");
		}
		System.out.println();
		// 우리가족이 점심을 먹었는지 boolean[]로 저장, 프린트
		boolean[] food = { true, true, false, true };
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}

		String[] s = new String[3];
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
