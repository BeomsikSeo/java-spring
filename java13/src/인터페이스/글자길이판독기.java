package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 글자길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame("문자판독기");
		f.setSize(300, 500);
		// flow를 만들어두고, 아래 코드에서 flow를 쓰는 경우
		// FlowLayout flow = new FlowLayout();
		// f.setLayout(flow);
		// 한번 쓰고 아래 코드에서 쓸 일이 없는 경우
		f.setLayout(new FlowLayout());
		
		Font font = new Font("궁서", Font.BOLD, 30);
		
		
		JLabel label = new JLabel("문장을 넣으세요.");
		JTextArea area = new JTextArea(7, 10);
		JButton b1 = new JButton("글자수카운트");
		JButton b2 = new JButton("배경색바꾸기");
		JButton b3 = new JButton("글자색바꾸기");
		
		label.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		
		f.add(label);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		// 1. text.length(); 글자수 구해줌
		b1.addActionListener(new ActionListener() { // new 뒤에 ActionListener는 인터페이스
													// ActionListener부터 마지막까지 전체가 익명클래스가 됨
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText(); // 입력한 문장
				JOptionPane.showMessageDialog(f, "글자수는 " + text.length());
				area.setText("");
			}
		}); // 익명클래스
		
		// 2. area.setBackground(Color.yellow);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.yellow);
				
			}
		});
		// 3. area.setForeground(Color.red);
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.red);
				
			}
		});
		
		f.setVisible(true);
		

	}

}
