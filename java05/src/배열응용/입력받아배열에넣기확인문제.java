package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기확인문제 {

	public static void main(String[] args) {
		// 작년에 가고 싶었던 곳 세곳을 입력받아 넣으세요.
		// 제주도, 양양, 속초
		// 올해에 가고 싶었던 곳 세곳을 입력받아 넣으세요.
		// 제주도, 부산, 울산
		// 입력은 운선순위에 따라 입력된 것이라 했을때
		// 작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 몇 곳 인가?
		// ==> 같은 위치에 있는 장소끼리만 비교해주세요.
		
		Scanner sc = new Scanner(System.in);
		
		String[] lastYear = new String[3];
		String[] thisYear = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print("작년에 가고 싶었던 곳을 세 곳 입력하세요 >> ");
			lastYear[i] = sc.next();
		} // for
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.print("올해 가고 싶었던 곳을 세 곳 입력하세요 >> ");
			thisYear[i] = sc.next();
		} // for
		
		sc.close();
		System.out.println();
		
		int count = 0;
		for (int i = 0; i < thisYear.length; i++) {
			if (lastYear[i].equals(thisYear[i])) {
				count++;
			} // if
		} // for
		System.out.println("작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은\n" + count + "곳");
		
	}

}
