package 자바DB연결;

import java.util.Scanner;

import 화면DB연결.ProductVO;

public class 상품등록 {

	public static void main(String[] args) {
		
		// 입력해보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("id/name/content 순으로 입력하세요.");
		String id = sc.next();
		String name = sc.next();
		String content = sc.next();
		
		// 1. 가방을 만들어주세요.
		ProductVO bag = new ProductVO();
		
		// 2. 가방에 데이터를 넣어주세요. set~~
		bag.setId(id);
		bag.setName(name);
		bag.setContent(content); // 가방에 값을 넣을 때는 하나씩 넣는다.
		
		// 3. 가방을 전달해주세요.
		ProductDAO dao = new ProductDAO();
		dao.insert(bag);
		
		sc.close();

	}

}
