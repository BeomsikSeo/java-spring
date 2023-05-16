package 생성자확인문제;

public class Mask {
	String color;
	int price;
	int count;
	
	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Mask [색=" + color + ", 가격=" + price + ", 개수=" + count + "]";
	}
	

}
