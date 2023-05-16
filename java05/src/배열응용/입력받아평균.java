package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러개 받아서
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
		System.out.println();

		// 1. 합계구해서, 평균구해보세요.
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < jumsu.length; i++) {
			sum = sum + jumsu[i]; // 합계, sum += jumsu[i];
		}

		avg = (double)sum / jumsu.length; // 평균

		System.out.println("합계는 " + sum);
		System.out.println("평균은 " + avg);

		System.out.println();

		// 2. 300 이상되는 숫자만 찾아서, 합계를 구해보세요.
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
			}
		}

		System.out.println("300이상 되는 숫자의 합계는 " + sum2);

		System.out.println();

		// 3. 300이상 되는 위치인 index를 프린트
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.print(i + " ");
			}
		}

	}

}
