package 화면DB연결;

import javax.swing.JOptionPane;

import 자바DB연결.MemberDAO3;

public class StartUI {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("ID를 입력하세요");
		String pw = JOptionPane.showInputDialog("PW를 입력하세요.");
		
		MemberDAO3 dao = new MemberDAO3();
		MemberVO bag = new MemberVO();
		
		bag.setId(id);
		bag.setPw(pw);
		
		int result = dao.login(bag);
		if (result == 1) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			BbsUI2 bbs = new BbsUI2();
			bbs.open();
			// BbsUI2.open(); 객체 생성하지 말고 스태틱 메서드이므로 바로 클래스명으로 접근
			// 하라는 경고
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
			MemberUI3 member = new MemberUI3();
			member.open();
			// MemberUI3.open();
		}
	}

}
