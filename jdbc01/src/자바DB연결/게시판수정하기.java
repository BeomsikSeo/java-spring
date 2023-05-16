package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 게시판 번호와 수정할 내용을 순서대로 넣어주세요");
		int no = sc.nextInt();
		String content = sc.next();
		
		BbsDAO dao = new BbsDAO();
		dao.update(no, content);
		
		sc.close();		

	}

}
