package 상속확인문제;

public class 내차들 {

	public static void main(String[] args) {
		CoffeeTruck ct = new CoffeeTruck();
		ct.category = "트럭";
		ct.item = "커피";
		ct.price = 4000;
		ct.seat = "두개";
		ct.size = "매우 큼";
		ct.tyre = 4;
		
		ct.breakPedal();
		ct.freight();
		ct.run();
		ct.sell();
		
		System.out.println(ct);
		
	}

}
