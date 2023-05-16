package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 150);
		
		// 물 흐르듯이 순서대로 배치해주는 부품을 램에 복사해서 가져다 놓아야 함.
		// FlowLayout
		FlowLayout flow = new FlowLayout();
		
		// f에 물 흐르듯이 배치해주는 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("버튼1");
		
		JLabel text1 = new JLabel();
		text1.setText("아이디"); // 글씨
		
		JButton b2 = new JButton();
		b2.setText("버튼2");
		
		JLabel text2 = new JLabel(); // 글씨
		text2.setText("패스워드");
		
		// 글자 넣는 곳..
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		//import가 안된 경우 Font위에 마우스를 올리면(또는 F2)
		//import Font~~를 클릭
		// 단축키로는 컨트롤 + 쉬프트 + o
		Font font = new Font("궁서", 1, 20);
		
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.red); // 배경색
		b1.setForeground(Color.white); // 버튼의 위색, 글자색
		b2.setBackground(Color.red); // 배경색
		b2.setForeground(Color.white); // 버튼의 위색, 글자색
		input1.setBackground(Color.red);
		input1.setForeground(Color.white);
		input2.setBackground(Color.red);
		input2.setForeground(Color.white);
		
		// 1.jpg 파일명을 쓰면 java02프로젝트 바로 아래 있는 것으로 인식!
		ImageIcon icon = new ImageIcon("1.jpg");
		ImageIcon icon2 = new ImageIcon("6.jpg");
		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		f.setVisible(true);

	}

}
