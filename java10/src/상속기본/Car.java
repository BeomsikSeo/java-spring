package 상속기본;

public class Car {
	// Car <--- FlyCar (Car를 만들어서 FlyCar를 만들 때 Car를 재사용(상속)해보세요)
	String color;
	
	public void run() {
		System.out.println("달리다");
	}
	// FlyCar사용.java에서 FlyCar fly = new FlyCar();
}
