package 스레드확인;

import java.util.Date;

public class 스레드002 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date min = new Date();
			System.out.println("분 >> " + min.getMinutes());
			try {
				Thread.sleep(60000);
			} catch (Exception e) {
				System.out.println("오류남");
			}
		}
	}
	
}
