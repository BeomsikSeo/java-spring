package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명2 {

	public static void main(String[] args) {
		
		// 인기투표해봅시다.!! 10명에게 받아봅시다.!!
		// 1) 아이유 2) 유재석 3) BTS
		
		int iu = 0;
		int mc = 0;
		int bts = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("좋아하는 사람 투표 1)아이유 2)유재석 3)BTS");
			if (data.equals("1")) {
				iu++;
			} else if (data.equals("2")) {
				mc++;
			} else if (data.equals("3")) {
				bts++;
			}
		}
		
		System.out.println("아이유를 좋아하는 사람 " + iu + "명");
		System.out.println("유재석을 좋아하는 사람 " + mc + "명");
		System.out.println("BTS를 좋아하는 사람 " + bts + "명");
		
		
	}

}
