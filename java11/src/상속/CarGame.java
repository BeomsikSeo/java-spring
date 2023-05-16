package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CarGame  extends JFrame{
	
	JLabel time;

	public static void main(String[] args) {
		CarGame f = new CarGame();
	}
	
	public CarGame() {
		setTitle("나의 자동차 경주게임");
		setSize(1000, 900);
		setLayout(null);
		
		Font font = new Font("궁서", Font.BOLD, 30);
		time = new JLabel("시분초");
		time.setFont(font);
		time.setBounds(0, 0, 700, 100);
		add(time);
		
		MyThread car1 = new MyThread("car01.png", 100, 100);
		MyThread car2 = new MyThread("car02.png", 100, 250);
		MyThread car3 = new MyThread("car03.png", 100, 400);
		타이머스레드2 time2 = new 타이머스레드2();
		
		car1.start();
		car2.start();
		car3.start();
		time2.start();
		
		setVisible(true);
		
	}
	
	public class MyThread extends Thread {
		int x, y;
		JLabel label; // 전역변수로 선언!
		
		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 300, 300); // jframe에 붙은 위치 저장
			add(label);
		}
		
		@Override
		public void run() {
			if (x > 800) {
				// 동시에 실행하고 싶은 내용!!
				// 모든 스레드가 오른쪽으로 움직이고 싶음.
				// 화면에서 오른쪽으로 움직이는 것은 x축 값을 늘려주는 것.!!
				JOptionPane.showMessageDialog(time, "경기가 끝났습니다"); 
			} else {
				for (int i = 0; i < 200; i++) {
					Random r = new Random();
					int move = r.nextInt(50); // 0 ~ 49
					x = x + move;
					System.out.println(x);
					label.setBounds(x, y, 300, 300); // 다시 위치 지정
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} 
			}
		} // run


	} // MyThread
	
	public class 타이머스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				time.setText(date + "");
				try {
					Thread.sleep(1000); // 1초 재워라!
				} catch (Exception e) {
					System.out.println("CPU 연결 문제 생김.");
				}
			}
		}

	} // 타이머스레드

} // CarGame
