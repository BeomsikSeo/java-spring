package 스레드확인;

public class 스레드사용 {

	public static void main(String[] args) {
		스레드001 sec = new 스레드001();
		스레드002 min = new 스레드002();
		스레드003 tenSec = new 스레드003();
		
		sec.start();
		min.start();
		tenSec.start();

	}

}
