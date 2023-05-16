package 상속응용;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		// 2. 스레드 사용
		스레드1 th1 = new 스레드1();
		스레드2 th2 = new 스레드2();
		스레드3 th3 = new 스레드3();
		
		// 3. 스레드 동시에 돌아가는 프로그램 시작
		th1.start();
		th2.start();
		th3.start();

	}

}
