package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.BbsDAO;

public class BbsUI2 {

	public static void open() {
		JFrame f = new JFrame();
		f.setTitle("게시판");
		f.setSize(530, 850);

		JLabel l0 = new JLabel("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		JLabel l1 = new JLabel("나의 게시판");
		JLabel l2 = new JLabel("게시판 번호");
		JLabel l3 = new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 글쓴이");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);

		JButton b1 = new JButton("게시판 글쓰기 처리");
		JButton b2 = new JButton("게시판 지우기 처리");
		JButton b3 = new JButton("게시판 수 정 처리");
		JButton b4 = new JButton("게시판 검 색 처리");

		// f에 위에 있는 요소들을 add로 붙여주어야하는데,
		// 붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		// 물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();

		// 폰트를 설정하기 위해 font부품 필요
		Font font = new Font("궁서", Font.BOLD, 40);

		//////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝
		/// 조립을 시작해보자. ///
		f.setLayout(flow);

		f.add(l1);
		f.add(l0);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(l5);
		f.add(t4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		t1.setBackground(Color.yellow);
		t1.setForeground(Color.blue);

		t2.setBackground(Color.yellow);
		t2.setForeground(Color.blue);

		t3.setBackground(Color.yellow);
		t3.setForeground(Color.blue);

		t4.setBackground(Color.yellow);
		t4.setForeground(Color.blue);

		b1.setBackground(Color.pink); // 배경색
		b1.setForeground(Color.red); // 글자색

		b2.setBackground(Color.pink);
		b2.setForeground(Color.red);

		b3.setBackground(Color.pink);
		b3.setForeground(Color.red);

		b4.setBackground(Color.pink);
		b4.setForeground(Color.red);

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("게시판 정보 검색");
				String no = t1.getText();
				int no2 = Integer.parseInt(no);

				BbsDAO dao = new BbsDAO();
				BbsVO bag = dao.one(no2);

				if (bag != null) {

					t2.setText(bag.getTitle());
					t3.setText(bag.getContent());
					t4.setText(bag.getWriter());
					t2.setBackground(Color.pink);
					t3.setBackground(Color.pink);
					t4.setBackground(Color.pink);

				} else {
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t2.setBackground(Color.yellow);
					t3.setBackground(Color.yellow);
					t4.setBackground(Color.yellow);
					JOptionPane.showMessageDialog(f, "검색결과 없음");
				}
			}
		});

		f.getContentPane().setBackground(Color.green);
		// 맨 끝으로~~~
		f.setVisible(true);

	}

}
