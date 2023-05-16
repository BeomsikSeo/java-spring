package 반복문;

// ! ==> not
public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터 중에서 짝수만 프린트!!
		
		for (int i = 1; i <= 10; i++) {
			//i가 8이 되면 for문 종료
			if (i == 8) {
				//break; // for문 종료, for문 아래에 있는 내용이 이어서 실행!!
				System.exit(0);
				// class 자체의 실행을 멈춤. for문 밖의 "휴~~" 이부분도 다 실행 안 됨
				// 0 : 정상종료
				// 0이 아닌 다른 값 : 비정상종료
			}
			if (i % 2 != 0) { // 홀수!
				continue; // 아래 다 스킵하고 다시 돌려라
				          // 이번 i만 for문 안의 내용을 실행하지 말아라!
			}
			System.out.println(i);
		}
		System.out.println("휴~~for문 다 끝났다.@@@");
	}

}
