package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균T {
	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서
		// 저장공간에 넣고 싶을 때 ==> 배열을 사용!!
		// 1. 배열을 만들어주세요.
		int[] jumsu = new int[5];

		// 배열에 값을 넣을 때는 index가 필요 ==> i가 있는 for문 사용해야함.
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			// 숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자.
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();

		// jumsu[0] ==> jumsu변수에 들어있는 주소가 가르키는 0번 인덱스 공간
		// 0???? ==? 위치값, 인덱스

		// 1. 전체 합계구해서, 평균구해보세요.
		// ==> 평균 = 합계 / 전체갯수
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x; // sum += x;
		}
		System.out.println("전체합계: " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("전체평균: " + avg);

		// 2. 300이상되는 숫자만 찾아서, 합계를 구해보세요.
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300이상 되는 합계: " + sum2);

		// 3. 심화문제, 300이상 되는 위치인 index를 프린트
		// ==> 해당 인덱스의 값이 300이상인지 조건 체크 --> i를 프린트
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				// 특정한 index에 있는 값이 300이상인 위치를 프린트해보세요.
				System.out.println("300인 값이 저장된 인덱스 : " + i);
			}
		}
	}
}