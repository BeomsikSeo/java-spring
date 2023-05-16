package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 그래픽형변환 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		// FlowLayout flow = new // FlowLayout();
		f.setLayout(new FlowLayout()); // flow라는 변수를 한번쓰고 말거면 만들필요없이 주소값을 바로 넣어줘도 됨!!
		
		// Component <- JButton 등등 자동형변환!!
		f.add(new JButton("나는 버튼")); // 대신 font, color 등 다른 설정 못함!
		f.add(new JLabel("나는 라벨"));
		f.add(new JTextField(10));
		
		f.setVisible(true);

	}

}
