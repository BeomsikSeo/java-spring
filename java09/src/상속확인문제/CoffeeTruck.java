package 상속확인문제;

public class CoffeeTruck extends Truck {
	String item;
	int price;
	
	public void sell() {
		System.out.println("커피를 팔다");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [판매제품=" + item + ", 가격=" + price + ", 좌석수=" + seat + ", 차량크기=" + size + ", 타이어수=" + tyre
				+ ", 차량종류=" + category + "]";
	}

	
	
	
}
