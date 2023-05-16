package 배열응용;

public class 여러개배열사용하기1 {

	public static void main(String[] args) {
		// 여러개의 배열을 사용하고 싶은 경우
		// 같은 인덱스를 쓰세요.
		// 아버지에 대한 정보는 모든 배열에서 0번에 넣자.
		String[] 식구 = { "아버지", "어머니", "형", "나" };
		int[] age = { 100, 50, 30, 25 };
		double[] height = { 175.5, 150.5, 180.5, 165.6 };
		// 컨트롤 + 쉬프트 + f : 코드 자동 정렬
		
		System.out.println("이름\t나이\t키");
		System.out.println("----------------------");
		for (int i = 0; i < height.length; i++) {
			System.out.println(식구[i] + "\t" + age[i] + "\t" + height[i]);
		} // for

	}

}
