package 반복문;

public class For3 {

	public static void main(String[] args) {
		// 1.
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println(); // 엔터를 치고 싶을 땐 이걸 넣어줌
		System.out.println();
		
		// 2.
		for (int i = 0; i < 5; i++) {
			System.out.print("커피*");
		}
		System.out.println();
		System.out.println();
		
		// 3.
		for (int i = 0; i < 3; i++) {
			System.out.println("커피*우유");
		}
		System.out.println();
		
		// 4.
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + " : 짱!");
		}
	}

}
