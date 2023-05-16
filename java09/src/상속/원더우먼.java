package 상속;

public class 원더우먼 extends 우먼 {
	boolean fly;
	int power;
	
	public void weapon() {
		run();
		System.out.println("무기를 잘쓴다");
	}

	@Override
	public void eat() {
		System.out.println("많이 먹다~~");
	}
	
	

	@Override
	public String toString() {
		return "원더우먼 [fly=" + fly + ", power=" + power + ", hair=" + hair + ", name=" + name + ", age=" + age + "]";
	}
	

}
