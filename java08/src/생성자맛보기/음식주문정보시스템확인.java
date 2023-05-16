package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 음식주문정보시스템확인 {

	static int count; // 통합개수 변수
	static int count1; // 짬뽕 갯수
	static int count2; // 짜장 갯수
	static int count3; // 우동 갯수
	final static int PRICE1 = 3500;
	final static int PRICE2 = 4000;
	final static int PRICE3 = 3000;
	static int result = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
	
	public static void main(String[] args) {
		JFrame f = new JFrame("음식주문시스템");
		f.setSize(520, 600);
		f.getContentPane().setBackground(Color.gray);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서", 1, 20);
		
		JButton[] btn = new JButton[5];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setFont(font);
		}
		
		btn[0].setText("처음으로");
		btn[1].setText("짬뽕");
		btn[2].setText("짜장");
		btn[3].setText("우동");
		btn[4].setText("결제하기");
		
		ImageIcon[] img = new ImageIcon[4];
		for (int i = 0; i < img.length; i++) {
			img[i] = new ImageIcon(i + ".png");
		}
		
		JLabel[] l = new JLabel[3];
		for (int i = 0; i < l.length; i++) {
			l[i] = new JLabel();
			l[i].setFont(font);
		}
		
		l[0].setIcon(img[0]);
		l[1].setText("짬뽕: " + count1 + "개, 짜장: " + count2 + "개, 우동: " + count3 + "개");
		l[2].setText("전체 결제 금액: " + result + "원");
		
		for (int i = 0; i < btn.length; i++) {
			f.add(btn[i]);
		}
		for (int i = 0; i < l.length; i++) {
			f.add(l[i]);
		}
		
		btn[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l[0].setIcon(img[0]);
				l[1].setText("짬뽕: " + count1 + "개, 짜장: " + count2 + "개, 우동: " + count3 + "개");
				l[2].setText("전체 결제 금액: " + result + "원");
			}
		});
		
		btn[1].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l[0].setIcon(img[1]);
				count1++;

			}
		});
		
		btn[2].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l[0].setIcon(img[2]);
				count++;

			}
		});
		
		btn[3].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				l[0].setIcon(img[3]);
				count++;

			}
		});
		
		btn[4].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "총 결제 금액은 " + result + "원입니다.");
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		f.setVisible(true);
		
	}

}
