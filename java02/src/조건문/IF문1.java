package 조건문;

public class IF문1 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		// x와 y가 같은지 비교해보고,
		// 같으면 "동일합니다" 프린트
		// 아니면 "동일하지 않아요" 프린트
		
		if (x == y) {
			System.out.println("동일합니다");
		} else {
			System.out.println("동일하지 않아요");
		}
		
		int id = 1111;
		int id2 = 2222;
		// id와 id2가 같은지 비교해보고,
		// 같으면 "로그인 성공" 프린트
		// 아니면 "로그인 실패" 프린트
		
		if (id != id2) {
			System.out.println("로그인 실패");
		} else {
			System.out.println("로그인 성공");
		}

	}

}
