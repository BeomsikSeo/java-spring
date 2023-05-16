package 확인문제;

import javax.swing.JOptionPane;

public class 문제풀이4 {

	public static void main(String[] args) {
		// 내 취미에 대해 기본형과 String으로 데이터를 변수에 넣고 출력해보세요.
		// 기본형 데이터 - 정수, 실수, 문자1, 논리, String
		String habby = JOptionPane.showInputDialog("당신의 취미는?");
		int hour = 1;
		double avg = 2.3;
		char body = '등';
		boolean yesterday = false;
		
		String resuString = "제 취미는 " + habby + "이고, 하루에 " + hour + "시간 합니다. 일주일 평균 " + 
		avg + "회 하고, 오늘은 " + body + "운동 했습니다.";
		
		System.out.println(resuString);
		System.out.println("어제는 갔나요? " + yesterday);
	}

}
