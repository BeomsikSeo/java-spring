package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {

	static int count = 0;
	
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(300, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("궁서", Font.BOLD, 150);
		
		JLabel l1 = new JLabel();
		l1.setFont(font);
		l1.setForeground(Color.red);
		l1.setText("0");
		
		JButton b1 = new JButton("1더하기");
		b1.setBackground(Color.green);
		
		JButton b2 = new JButton("0으로 초기화");
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		
		JButton b3 = new JButton("1빼기");
		b3.setBackground(Color.green);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				l1.setText(count + "");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0 ;
				l1.setText(count + "");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				l1.setText(count + "");
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		
		f.setVisible(true);
	}

}
