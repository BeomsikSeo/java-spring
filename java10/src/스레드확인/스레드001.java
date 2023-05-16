package 스레드확인;

import java.util.Date;

public class 스레드001 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date sec = new Date();
			System.out.println("초 >> " + sec.getSeconds());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("오류남");
			}
		}
	}
	
}
