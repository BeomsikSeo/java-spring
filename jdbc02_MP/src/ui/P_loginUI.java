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

public class P_loginUI {
	
	public static String id;

	public void open() {
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.setSize(350, 300);
		
		Font font1 = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 20);
		Font font3 = new Font("궁서", 0, 20);
		
		JLabel l1 = new JLabel("           로그인 화면         "); // title
		JLabel l2 = new JLabel("ID"); // ID
		JLabel l3 = new JLabel("PW"); // PW
		
		JTextField t1 = new JTextField(20); // ID
		JTextField t2 = new JTextField(20); // PW
		
		JButton b1 = new JButton("로그인");
		JButton b2 = new JButton("창 닫기");
		
		l1.setFont(font1);
		l2.setFont(font2);
		l3.setFont(font2);
		t1.setFont(font3);
		t2.setFont(font3);
		b1.setFont(font2);
		
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		
		f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(b1);
		f.add(b2);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				id = t1.getText();
				String pw = t2.getText();
				
				P_memberVO bag = new P_memberVO();
				bag.setId(id);
				bag.setPw(pw);
				
				P_memberDAO dao = new P_memberDAO();
				int result = dao.login(bag);
				
				if (result == 1) {
					
					JOptionPane.showMessageDialog(f, "로그인 성공");
					MainUI2 main = new MainUI2();
					main.open();
					f.setVisible(false);
					
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
					MainUI.main(null);
					f.setVisible(false);
				}
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
