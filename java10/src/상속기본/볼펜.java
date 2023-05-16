package 상속기본;

public class 볼펜 extends 학용품 {
	double width;
	
	public void 글을쓰다() {
		System.out.println("볼펜을 사용하여 글을 쓰다");
	}

	@Override
	public String toString() {
		return "볼펜 [width=" + width + ", price=" + price + ", brand=" + brand + "]";
	}

	
	
}
