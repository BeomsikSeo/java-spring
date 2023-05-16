package 복습;

public class Mask {
	// 멤버 변수
	String color;
	int price;
	int count;
	// 클래스이름과 동일한 메서드를 만들어주면,
	// new를 가지고 객체생성시 자동호출
	// 생성자(메서드) ==> constructor(컨스트럭터)
	public Mask(String color, int price, int count) {
		super();
		this.color = color;
		this.price = price;
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
}
