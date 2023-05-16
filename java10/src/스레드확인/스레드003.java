package 스레드확인;

public class 스레드003 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				System.out.println("오류남");
			}
			System.out.println("10초 지남");
		}
	}
}
