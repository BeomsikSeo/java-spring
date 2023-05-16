package ui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.P_memberDAO;
import vo.P_memberVO;

public class P_memberUI {

	public void open() {
		
		JFrame f = new JFrame("회원가입 화면");
		f.setLayout(new FlowLayout());
		f.setSize(360, 400);
		
		Font font1 = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 20);
		Font font3 = new Font("궁서", 0, 20);
		
		JLabel l1 = new JLabel("           회원가입 화면         "); // title
		JLabel l2 = new JLabel("ID"); // ID
		JLabel l3 = new JLabel("PW"); // PW
		JLabel l4 = new JLabel("이름"); // 이름
		JLabel l5 = new JLabel("TEL"); // TEL
		JLabel l6 = new JLabel("주소"); // 주소
		
		JTextField t1 = new JTextField(20); // ID
		JTextField t2 = new JTextField(20); // PW
		JTextField t3 = new JTextField(20); // 이름
		JTextField t4 = new JTextField(20); // TEL
		JTextField t5 = new JTextField(20); // 주소
		
		JButton b1 = new JButton("가입");
		JButton b2 = new JButton("탈퇴");
		JButton b3 = new JButton("수정");
		JButton b4 = new JButton("조회");
		JButton b5 = new JButton("창 닫기");
		
		l1.setFont(font1);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		t1.setFont(font3);
		t2.setFont(font3);
		t3.setFont(font3);
		t4.setFont(font3);
		t5.setFont(font3);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		b4.setFont(font2);
		
		b1.setBackground(Color.blue);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		b4.setForeground(Color.white);
		
		f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(l6); f.add(t5);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		f.getContentPane().setBackground(Color.cyan);
		
		// 가입
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				String addr = t5.getText();
				
				P_memberVO bag = new P_memberVO();
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				bag.setAddr(addr);
				
				P_memberDAO dao = new P_memberDAO();
				int result = dao.insert(bag);
				
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원가입 성공");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "회원가입 실패");
				}
				
			} // action
		}); // b1
		
		// 탈퇴
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				
				P_memberDAO dao = new P_memberDAO();
				int result = dao.delete(id);
				
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "회원탈퇴 성공");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "회원탈퇴 실패");
				}
				
			} // action
		}); // b2
		
		// 수정
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
		
		// 조회
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
								
				P_memberDAO dao = new P_memberDAO();
				P_memberVO bag = dao.one(id);
				
				
				if (bag != null) {
					t2.setText(bag.getPw());
					t3.setText(bag.getName());
					t4.setText(bag.getTel());
					t5.setText(bag.getAddr());
				} else {
					JOptionPane.showMessageDialog(f, "회원조회 실패");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
				}
				
			} // action
		}); // b4
		
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}

}
