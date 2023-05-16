package ui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainUI2 {

	public void open() {
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.setSize(300, 600);

		JButton b1 = new JButton("로그아웃");
		JButton b2 = new JButton("회원정보");
		JButton b3 = new JButton("주문하기");
		JButton b4 = new JButton("가게정보");
		JButton b5 = new JButton("맛집추천");
		JButton b6 = new JButton("리뷰");

		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b6.setFont(font);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainUI.main(null);
				f.setVisible(false);
			}
		}); // b1

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				P_memberDBUI2 db = new P_memberDBUI2();
				db.open();
			}
		}); // b2

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				P_orderUI order = new P_orderUI();
				order.open();
			}
		}); // b3

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		}); // b4

		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		}); // b5

		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		}); // b6

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}

}
