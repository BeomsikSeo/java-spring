package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 부품만들기3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,500);
		f.getContentPane().setBackground(Color.gray);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon1 = new ImageIcon("017.png");
		
		ImageIcon icon2 = new ImageIcon("018.png");		
		
		JLabel text1 = new JLabel();
		text1.setIcon(icon1);
		
		JLabel text2 = new JLabel();
		text2.setText("아이디");
		
		JLabel text3 = new JLabel();
		text3.setText("비밀번호");
		
		JLabel text4 = new JLabel();
		text4.setText("이름");

		JLabel text5 = new JLabel();
		text5.setText("전화번호");
		
		TextField input1 = new TextField(10);
		TextField input2 = new TextField(10);
		TextField input3 = new TextField(10);
		TextField input4 = new TextField(10);
		
		Font font = new Font("d2Coding", 1, 30);
		
		JButton b1 = new JButton();
		b1.setIcon(icon2);
		
		f.add(text1);
		f.add(text2);
		f.add(input1);
		f.add(text3);
		f.add(input2);
		f.add(text4);
		f.add(input3);
		f.add(text5);
		f.add(input4);
		f.add(b1);
		
		f.setVisible(true);
		
		
	}

}
