package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// 1. 입력
		//	당신이 좋아하는 운동은? 헬스
		//	당신이 운동하기 좋아하는 요일은? 금요일
		// 2. 처리
		// 	금요일에 저는 헬스를 합니다.
		// 3. 출력
		
		String sports = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String day = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		
		//처리
		String resultString = "저는 " + day + "에 " + sports + "를 합니다.";
		
		//출력
		System.out.println(resultString);
	}

}
