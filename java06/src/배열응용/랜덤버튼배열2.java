package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임을 만들어보세요.
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.getContentPane().setBackground(Color.yellow);
		
		// 2. 프레임 설정해보세요. 실행해서 눈으로 확인
		//    레이아웃 부품 설정하지 않음.
		f.setLayout(null);
		
		// 3. 버튼을 넣을 배열을 먼저 만들어두세요. 500개
		JButton[] buttons = new JButton[500]; // 기본형이 아닌 데이터는 참조형
		// 참조형은 배열에 null로 초기화
		// {null, null, null, null, ...};
		Color[] colors = {Color.red, Color.blue, Color.white, Color.gray, Color.green};
		
		// 4. 버튼을 500개 만들어서 배열에 넣어주세요.
		Random r = new Random();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i);
			buttons[i].setBackground(colors[r.nextInt(5)]); // r.nextInt(colors.length)
		}
		
		// 5. 배열에 있는 버튼을 꺼내서 위치를 지정 후, f에 붙여주세요.
		
		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(900); // 가로 위치
			int y = r.nextInt(700); // 세로 위치
			buttons[i].setBounds(x, y, 100, 50);
			f.add(buttons[i]);
		}

		
		// 심화-1)) 버튼 색을 몇 가지 지정해서 임의로 설정, 힌트 Color 배열
		// Color[] colors = {Color.red, Color.blue, Color.white, Color.gray, Color.green}
		// 심화-2)) f에 배경색을 넣어보세요.
		f.setVisible(true);

	}

}
