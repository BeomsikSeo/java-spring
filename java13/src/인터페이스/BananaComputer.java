package 인터페이스;

public class BananaComputer implements Computer {

	@Override
	public void 전원을켜다() {
		System.out.println("안면인식으로 전원을 켜다");

	}

	@Override
	public void 모니터를연결하다() {
		System.out.println("C타입으로 모니터를 연결하다");

	}

	@Override
	public void 게임을하다() {
		System.out.println("고사양게임을 하다");

	}

}
