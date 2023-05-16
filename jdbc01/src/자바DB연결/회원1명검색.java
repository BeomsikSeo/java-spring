package 자바DB연결;

import java.util.Scanner;

import javax.swing.JOptionPane;

import 화면DB연결.MemberVO;

public class 회원1명검색 {

	public static void main(String[] args) {
		
		// 입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 id를 입력하세요.");
		
		String id = sc.next();
		
		MemberDAO3 dao = new MemberDAO3();
		MemberVO bag = dao.one(id);
		String total = bag.getId() + ", " + bag.getPw() + ", " + bag.getName() + ", " + bag.getTel();
		JOptionPane.showMessageDialog(null, total);
		
		sc.close();

	}

}
