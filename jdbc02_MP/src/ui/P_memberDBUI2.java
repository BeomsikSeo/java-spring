package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import dao.P_memberDAO;
import vo.P_memberVO;

public class P_memberDBUI2 {

	public void open() {
		
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.setLayout(new FlowLayout());
		
		JLabel l1 = new JLabel("ID로 회원검색");
		JTextField t1 = new JTextField(10);
		
		JButton b1 = new JButton("                                             전체 회원정보                                                 ");
		JButton b2 = new JButton("검색");
		JButton b3 = new JButton("회원정보수정");
		JButton b4 = new JButton("창 닫기");
		String[] header = { "ID", "PW", "이름", "전화번호", "주소" };
		P_memberDAO dao = new P_memberDAO();
		ArrayList<P_memberVO> list = dao.list();
		Object[][] all = new Object[list.size()][5];
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<P_memberVO> list = dao.list();
				
				if (list.size() == 0) {
					System.out.println("검색결과 없음.");
				} else {
					System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");
					for (int i = 0; i < list.size(); i++) {
						all[i][0] = list.get(i).getId();
						all[i][1] = list.get(i).getPw();
						all[i][2] = list.get(i).getName();
						all[i][3] = list.get(i).getTel();
						all[i][4] = list.get(i).getAddr();
					}
				}
						
			} // action
		}); // b1
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = t1.getText();
				P_memberVO bag = dao.one(id);
				all[0][0] = bag.getId();
				all[0][1] = bag.getPw();
				all[0][2] = bag.getName();
				all[0][3] = bag.getTel();
				all[0][4] = bag.getAddr();
				
				for (int i = 1; i < list.size(); i++) {
					for (int j = 0; j < all[i].length; j++) {
						all[i][j] = null;
					}
				}
	
			} // action
		}); // b2
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String choice = JOptionPane.showInputDialog("1) PW 변경, 2) 이름 변경, 3) Tel 변경, 4) 주소 변경");
				
				if (choice.equals("1")) {
					
					P_memberVO bag = new P_memberVO();
					String id = JOptionPane.showInputDialog("아이디를 입력하세요");
					bag.setId(id);
					String pw = JOptionPane.showInputDialog("변경할 PW를 입력하세요");
					bag.setPw(pw);
					
					P_memberDAO dao = new P_memberDAO();
					int result = dao.updatePw(bag);
					
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "정보수정 성공");
					} else {
						JOptionPane.showMessageDialog(f, "정보수정 실패");
					}
					
				} else if (choice.equals("2")) {
					
					P_memberVO bag = new P_memberVO();
					String id = JOptionPane.showInputDialog("아이디를 입력하세요");
					bag.setId(id);
					String name = JOptionPane.showInputDialog("변경할 이름을 입력하세요");
					bag.setName(name);
					
					P_memberDAO dao = new P_memberDAO();
					int result = dao.updateName(bag);
					
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "정보수정 성공");
					} else {
						JOptionPane.showMessageDialog(f, "정보수정 실패");
					}
					
				} else if (choice.equals("3")) {
					
					P_memberVO bag = new P_memberVO();
					String id = JOptionPane.showInputDialog("아이디를 입력하세요");
					bag.setId(id);
					String tel = JOptionPane.showInputDialog("변경할 전화번호를 입력하세요");
					bag.setTel(tel);
					
					P_memberDAO dao = new P_memberDAO();
					int result = dao.updateTel(bag);
					
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "정보수정 성공");
					} else {
						JOptionPane.showMessageDialog(f, "정보수정 실패");
					}
					
				} else if (choice.equals("4")) {
					
					P_memberVO bag = new P_memberVO();
					String id = JOptionPane.showInputDialog("아이디를 입력하세요");
					bag.setId(id);
					String addr = JOptionPane.showInputDialog("변경할 주소를 입력하세요");
					bag.setAddr(addr);
					
					P_memberDAO dao = new P_memberDAO();
					int result = dao.updateAddr(bag);
					
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "정보수정 성공");
					} else {
						JOptionPane.showMessageDialog(f, "정보수정 실패");
					}
					
				} else {
					JOptionPane.showMessageDialog(f, "1, 2, 3, 4 중 하나를 입력하세요");
				}
						
			} // action
		}); // b3		
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();				
			}
		});
		
		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		
		f.add(b1);
		f.add(l1);
		f.add(t1); f.add(b2); 
		f.add(b3);
		f.add(scroll);
		f.add(b4);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}

}
