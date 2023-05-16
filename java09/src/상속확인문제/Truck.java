package 상속확인문제;

public class Truck extends Car {
	String seat;
	String size;
	
	public void freight() {
		System.out.println("많은 짐을 실을 수 있다");
	}
	
	@Override
	public void run() {
		System.out.println("신나게 달릴 수 없다");
	}
	
}
