package 배열심화;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 배열2차원2 {

	public static void main(String[] args) {
		Random r = new Random();
		JFrame f = new JFrame();
		
		f.setSize(500, 500);
		String[] header = {"컴퓨터", "영어", "수학", "체육"};
		Integer[][] contents = new Integer[50][4];
				
		for (int i = 0; i < contents.length; i++) {
			for (int j = 0; j < contents[i].length; j++) {
				contents[i][j] = r.nextInt(101);
			}
		}
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
	}

}
