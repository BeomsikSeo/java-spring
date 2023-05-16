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

public class 음식주문정보시스템2T {

	// 심화
	// 1) 버튼을 클릭했을 때, 각 음식의 주문량을 체크해서 f의 title로 보여주세요.!!
	// f.setTitle("짬봉: " + count1 + "개, 우동: " + count2 + "개, " ~~);
	// 2) 음식의 값을 다 분리, 짬뽕은 3500, 우동은 3000, 짜장은 4000

	static int count; // 0으로 초기화, 전역변수!
	static int count1; // 짬뽕
	static int count2; // 우동
	static int count3; // 짜장
	final static int PRICE = 5000; // final은 변경불가, 상수
	// 상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로!를 권장!!!
	final static int PRICE1 = 3500; // 짬뽕
	final static int PRICE2 = 3000; // 우동
	final static int PRICE3 = 4000; // 짜장

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("음식주문시스템");
		f.setSize(600, 500);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("짬뽕");
		JButton b2 = new JButton("우동");
		JButton b3 = new JButton("짜장");
		Font font = new Font("궁서", Font.ITALIC, 30);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b1.setBackground(Color.pink);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.cyan);

		JLabel textLabel = new JLabel("개수: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("home.png");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("111.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				count1++;
				f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: " + count3 + "개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("결제금액 " + total + "원");
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("222.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");
				count2++;
				f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: " + count3 + "개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("결제금액 " + total + "원");
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("333.png");
				imgLabel.setIcon(icon);
				count++;
				countLabel.setText(count + "개");
				result.setText("결제금액 " + (count * PRICE) + "원");
				count3++;
				f.setTitle("짬뽕: " + count1 + "개, 우동: " + count2 + "개, 짜장: " + count3 + "개");
				int total = (count1 * PRICE1) + (count2 * PRICE2) + (count3 * PRICE3);
				result.setText("결제금액 " + total + "원");
			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);

		f.setVisible(true);
	}

}
