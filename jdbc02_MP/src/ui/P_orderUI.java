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

import dao.P_orderDAO;
import vo.P_orderVO;

public class P_orderUI {

	public void open() {
		
		JFrame f = new JFrame("음식 주문 화면");
		f.setLayout(new FlowLayout());
		f.setSize(400, 400);
		
		Font font1 = new Font("궁서", Font.BOLD, 40);
		Font font2 = new Font("궁서", Font.BOLD, 20);
		Font font3 = new Font("궁서", 0, 20);
		
		JLabel l1 = new JLabel("           음식 주문 화면         "); // title
		JLabel l2 = new JLabel("메뉴번호");
		JLabel l3 = new JLabel("가게이름"); // 가게이름
		JLabel l4 = new JLabel("카테고리"); // 카테고리
		JLabel l5 = new JLabel("주문메뉴"); // 주문메뉴
		JLabel l6 = new JLabel("가격"); // 가격
		JLabel l7 = new JLabel("주문자"); // 주문자
		
		JTextField t1 = new JTextField(5); // 메뉴번호
		JTextField t2 = new JTextField(20); // 가게이름
		JTextField t3 = new JTextField(20); // 카테고리
		JTextField t4 = new JTextField(20); // 주문메뉴
		JTextField t5 = new JTextField(20); // 가격
		JTextField t6 = new JTextField(20); // 주문자
		
		t6.setText(P_loginUI.id);
		
		JButton b1 = new JButton("정보 불러오기");
		JButton b2 = new JButton("주문하기");
		JButton b3 = new JButton("창 닫기");
		
		l1.setFont(font1);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		l7.setFont(font2);
		t1.setFont(font3);
		t2.setFont(font3);
		t3.setFont(font3);
		t4.setFont(font3);
		t5.setFont(font3);
		t6.setFont(font3);
		b1.setFont(font2);
		b2.setFont(font2);
		
		b1.setBackground(Color.blue);
		b2.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		
		f.add(l1);
		f.add(l2); f.add(t1); f.add(b1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(l6); f.add(t5);
		f.add(l7); f.add(t6);
		f.add(b2);
		f.add(b3);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String no = t1.getText();
				int no2 = Integer.parseInt(no);
				
				P_orderDAO dao = new P_orderDAO();
				P_orderVO bag = dao.one(no2);
				
				t2.setText(bag.getStore());
				t3.setText(bag.getCategory());
				t4.setText(bag.getMenu_name());
				t5.setText(bag.getPrice() + "");
				
			} // action
		}); // b1
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				
//				String no = t1.getText();
//				int no2 = Integer.parseInt(no);
				
				String menu_no = t1.getText();
				int menu_no2 = Integer.parseInt(menu_no);
				
				String id = t6.getText();
				
				P_orderVO bag = new P_orderVO();
//				bag.setNo(no2);
				bag.setMenu_no(menu_no2);
				bag.setId(id);
				
				P_orderDAO dao = new P_orderDAO();
				int result = dao.insert(bag);
				
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "주문성공");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "주문실패");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
				}
				
			} // action
		}); // b2
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);

	}

}
