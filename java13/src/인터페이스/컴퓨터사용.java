package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		Computer a = new AppleComputer(); // 부모클래스와같이 형변환이 가능!!!
		BananaComputer b = new BananaComputer();
		a.게임을하다();
		a.모니터를연결하다();
		a.전원을켜다();
		b.게임을하다();
		b.모니터를연결하다();
		b.전원을켜다();

	}

}
