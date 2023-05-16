package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import dao.P_memberDAO;
import vo.P_memberVO;

public class P_memberDBUI {

	public void open() {
		
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("창 닫기");
		
		P_memberDAO dao = new P_memberDAO();
		ArrayList<P_memberVO> list = dao.list();

		String[] header = { "ID", "PW", "이름", "전화번호", "주소" };
		Object[][] all = new Object[list.size()][5];

		if (list.size() == 0) {
			System.out.println("검색결과 없음.");
		} else {
			System.out.println("검색결과는 전체 " + list.size() + "개 입니다.");
			for (int i = 0; i < list.size(); i++) {
				all[i][0] = list.get(i).getId();
				all[i][1] = list.get(i).getPw();
				all[i][2] = list.get(i).getName();
				all[i][3] = list.get(i).getTel();
				all[i][4] = list.get(i).getAddr();
			}
		}
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();				
			}
		});
		
		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(b1);
		f.add(scroll);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);

	}

}
