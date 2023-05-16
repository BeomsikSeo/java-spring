package 인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void 전원을켜다() {
		System.out.println("지문으로 전원을 켜다");

	}

	@Override
	public void 모니터를연결하다() {
		System.out.println("hdmi로 모니터를 연결하다");

	}

	@Override
	public void 게임을하다() {
		System.out.println("저사양게임을 하다");

	}

}
