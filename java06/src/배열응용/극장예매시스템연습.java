package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템연습 {

	public static void main(String[] args) {
		// JFrame 1
		// FlowLayout 1
		// JLabel 1 (제목)
		// JButton 100개 배열
		// 버튼을 누를경우 버튼 색 빨강, 글자 색 흰색으로 변경
		//                 버튼 사용 불가로 변경
		// JButton 1 (선택완료)
		// 선택된 좌석 알림창 띄우기
		// 좌석당 만 원으로 최종 결제금액 띄우기
		JFrame f = new JFrame();
		f.setSize(460, 800);
	    f.getContentPane().setBackground(Color.gray);
	    
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("d2Coding", 1, 40);
		Font font2 = new Font("d2Coding", 1, 20);
		
		JLabel title = new JLabel("영화 좌석예매 시스템");
		title.setFont(font1);
		f.add(title);
		
		JLabel title2 = new JLabel("===========================================================");
		f.add(title2);
		
		JButton[] btn = new JButton[100];
		int[] seat = new int[btn.length];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + 1 + "");
			btn[i].setFont(font2);
			btn[i].setForeground(Color.DARK_GRAY);
			f.add(btn[i]);
			
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					int no = Integer.parseInt(text);
					JOptionPane.showMessageDialog(f, no + "번이 선택되었습니다");
					seat[no-1] = 1;
					btn[no-1].setBackground(Color.red);
					btn[no-1].setText("완료");
				} // public void ~~
			}); // action
		} // for
		
		JButton btn1 = new JButton("선택완료");
		btn1.setFont(font2);
		btn1.setBackground(Color.green);
		f.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int count = 0;
				String seatNo = "";
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						count++;
						seatNo = seatNo + " " + (i + 1);
					} // if
				} // for
				JOptionPane.showMessageDialog(f, "당신이 선택한 좌석은 " + seatNo);
				JOptionPane.showMessageDialog(f, "결제금액은 " + (count * 10000));
			}
		}); // action
		
		f.setVisible(true);
	}

}
