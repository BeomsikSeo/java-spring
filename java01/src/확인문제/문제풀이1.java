package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		// 1. 입력
		// 오늘은 무슨 요일인가요? 월요일
		// 수업 끝나고 무엇을 하실 예정인가요? 놀기
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String doString = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
		// 2. 처리
		// 오늘 월요일에 수업 후 나는 놀기할 예정
		String resultString = "오늘 " + day + "에 수업 후 나는 " + doString + "할 예정";
				
		// 3. 출력
		// 처리한 내용을 출력해주세요.
		System.out.println(resultString);

	}

}
