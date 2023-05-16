package ui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.setSize(300, 600);

		JButton b1 = new JButton("로그인");
		JButton b2 = new JButton("회원가입");
		JButton b3 = new JButton("회원정보");
		JButton b4 = new JButton("주문하기");
		JButton b5 = new JButton("가게정보");
		JButton b6 = new JButton("맛집추천");
		JButton b7 = new JButton("리뷰");

		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b6.setFont(font);
		b7.setFont(font);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				P_loginUI login = new P_loginUI();
				login.open();
				f.setVisible(false);

			}
		}); // b1

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				P_memberUI member = new P_memberUI();
				member.open();

			}
		}); // b2

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "로그인 후 이용해주세요");
			}
		}); // b3

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "로그인 후 이용해주세요");
			}
		}); // b4

		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "로그인 후 이용해주세요");
			}
		}); // b5

		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "로그인 후 이용해주세요");
			}
		}); // b6

		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "로그인 후 이용해주세요");
			}
		}); // b7

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}

}
