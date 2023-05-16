package 상속;

public class 우먼 extends 사람 {
	String hair;
	
	public void run() {
		System.out.println("빨리 달리다.");
	}

	@Override
	public void eat() {
		System.out.println("조금 먹는다");
	}
	
	
	
}
