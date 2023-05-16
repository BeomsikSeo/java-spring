package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표시스템2 {

	public static void main(String[] args) {
		// PPT 오늘의 미션 K-pop 인기투표 만들기

		JFrame f = new JFrame();
		f.setSize(700, 800);
		f.getContentPane().setBackground(Color.gray);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font1 = new Font("바탕", 1, 50);
		Font font2 = new Font("d2coding", 1, 20);
		Font font3 = new Font("d2coding", 1, 30);

		JLabel text1 = new JLabel();
		text1.setText("K-pop 인기 투표"); // 제목
		text1.setFont(font1);

		JLabel text2 = new JLabel();
		text2.setText("1. 아이유-라일락"); // 소제목1
		text2.setFont(font2);

		JLabel text3 = new JLabel();
		text3.setText("2. 프로미스나인-we go"); // 소제목2
		text3.setFont(font2);

		JLabel text4 = new JLabel();
		text4.setText("3. 스테이씨 - ASAP"); // 소제목3
		text4.setFont(font2);

		JLabel text5 = new JLabel(); // 투표1
		text5.setFont(font3);

		JLabel text6 = new JLabel(); // 투표2
		text6.setFont(font3);

		JLabel text7 = new JLabel(); // 투표3
		text7.setFont(font3);

		ImageIcon icon1 = new ImageIcon("iu.png");
		ImageIcon icon2 = new ImageIcon("프로미스나인.png");
		ImageIcon icon3 = new ImageIcon("스테이시.png");

		JButton b1 = new JButton();
		b1.setIcon(icon1);

		JButton b2 = new JButton();
		b2.setIcon(icon2);

		JButton b3 = new JButton();
		b3.setIcon(icon3);

		f.add(text1);
		f.add(b1);
		f.add(text2);
		f.add(text5);
		f.add(b2);
		f.add(text3);
		f.add(text6);
		f.add(b3);
		f.add(text4);
		f.add(text7);

		// 버튼에 액션기능을 추가할 때는
		// 1. 액션기능 추가 ==> b1.addActionListener
		// 2. 버튼을 클릭했을 때 어떤 부품을 처리할지 부품 지정
		// ==> new ActionListener()
		// 3. 버튼을 클릭했을 때 처리 내용을 코딩

		b1.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {

				i++;
				text5.setText(i + "표");
			}
		});

		b2.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {

				i++;
				text6.setText(i + "표");
			}
		});

		b3.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {

				i++;
				text7.setText(i + "표");
			}
		});

		f.setVisible(true);

	}

}
