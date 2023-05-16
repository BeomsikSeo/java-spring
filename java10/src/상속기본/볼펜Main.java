package 상속기본;

public class 볼펜Main {

	public static void main(String[] args) {
		볼펜 p = new 볼펜();
		p.brand = "모나미";
		p.price = 2000;
		p.width = 0.7;
		
		p.사다();
		p.글을쓰다();
		System.out.println(p);

	}

}
