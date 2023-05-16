package 복습;

import javax.swing.JOptionPane;

public class 문제풀이 {

	public static void main(String[] args) {
		// 1~2번 equals() 사용합니다.
		
				// 1) 암호를 대시오 입력 ==> pass라고 입력
				// 암호가 맞으면 "들어오세요." 프린트
				// 암호가 틀리면 "나가세요." 프린트
				
				// 2) 당신이 먹고 싶은 저녁 메뉴는 (자장면, 라면, 회)에서 선택
				// 자장면이면 "중국집으로 가요" 프린트
				// 라면이면 "분식집으로 가요" 프린트
				// 회이면 "횟집으로 가요" 프린트
				// 위에 없으면 "그냥 안먹어요" 프린트
				
				// 3) JOptionPane을 사용
				// 두 정수를 입력받으세요. --> 누가 더 큰지 출력!
				
				// 4) 사원번호 ==> String no = "A100EX";
				// 맨 앞에 있는 글자를 추출 no.charAt(0)을 이용
				// A이면 기획부 프린트, B이면 총무부 프린트, C이면 개발부 프린트, 아니면 해당부서없음 프린트
				
				// 1)
				String pw = JOptionPane.showInputDialog("암호를 대시오");
				
				if (pw.equals("pass")) {
					System.out.println("들어오세요");
				} else {
					System.out.println("나가세요");
				}
				
				// 2)
				String menu = JOptionPane.showInputDialog("먹고 싶은 저녁 메뉴는? (자장면, 라면, 회) 중 하나 입력");
				
				if (menu.equals("자장면")) {
					System.out.println("중국집으로 가요");
				} else if (menu.equals("라면")) {
					System.out.println("분식집으로 가요");
				} else if (menu.equals("회")) {
					System.out.println("횟집으로 가요");
				} else {
					System.out.println("그냥 안먹어요");
				}
				
				// 3)
				String num1 = JOptionPane.showInputDialog("정수를 입력하세요");
				String num2 = JOptionPane.showInputDialog("또 다른 정수를 입력하세요");
				
				// 정수로 변환 Integer.parseInt()
				int num3 = Integer.parseInt(num1);
				int num4 = Integer.parseInt(num2);
				
				if (num3 > num4) {
					System.out.println("앞에 입력한 값이 더 큽니다");
				} else if (num3 < num4) {
					System.out.println("나중에 입력한 값이 더 큽니다");
				} else {
					System.out.println("두 수가 같습니다");
				}
				
				// 4)
				String no = "A100EX";
				
				char no2 = no.charAt(0);
				
				switch (no2) { // int, char, string
				case 'A':
					System.out.println("기획부");
					break;
				case 'B':
					System.out.println("총무부");
					break;
				case 'C':
					System.out.println("개발부");
					break;
				default:
					System.out.println("해당없음");
					break;
				}
	}

}
