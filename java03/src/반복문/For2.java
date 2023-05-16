package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for (; ;) { //무한 루프(반복) , while(true) << 그대로 이걸로 바꿔도 됨
			System.out.println("잘쓰지 않음.");
			String data = JOptionPane.showInputDialog("종료할까요?? y를 입력");
			// == 연산자는 기본데이터만 비교 가능
			// String 부품에서 제공하는 기능을 사용해서 비교해주어야 함.
			if (data.equals("y")) {
				System.out.println("안녕히가세요!!!");
				break; // for문의 break!
				       // 조건이 맞으면 break가 걸리는 것이기 때문에
				       // 반드시 true일 때만 이어서 if문 안에 들어와야함!!!!
			}
		}
	}

}
