package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전에 온 손님 수
		int count2 = 4; // 오후에 온 손님 수
		
		// 계산기 3을 이요해주세요.
		// 1. 전체 손님 수를 반환받아서 다음과 같이 프린트
		//    오늘 온 손님의 총 합은 9명입니다.
		System.out.println("오늘 온 손님의 총 합은 " + cal3.add(count1, count2) + "명입니다.");
		
		// 2. 오전과 오후 손님수 차이는?
		//    손님 수 차이는 1명입니다.
		System.out.println("오전과 오후 손님 수 차이는 " + Math.abs(cal3.minus(count1, count2)) + "명입니다.");
		// Math.abs : 절대값, .PI : 파이, .ceil : 올림, .floor : 내림, .round : 반올림, 
		//     .sqrt : 루트, .max : 최대값, .min : 최소값, .pow(2, 3) : 2의 3제곱
		
		// 3. 오전에 들어온 손님의 결제 금액은?
		//    오전 결제금액은 35000원입니다.
		System.out.println("오전 결제금액은 " + cal3.mul(count1, price) + "원입니다.");
		
		// 4. 오후에 들어온 손님의 결제 금액은?
		//    오후 결제금액은 28000원입니다.
		System.out.println("오전 결제금액은 " + cal3.mul(count2, price) + "원입니다.");
		
		// 5. 오전과 오후에 들어온 손님의 총 결제금액은?
		//    오늘 하루 총 결제금액은 63000원입니다.
		System.out.println("오늘 하루 총 결제금액은 " + cal3.mul(cal3.add(count1, count2), price) + "원입니다.");
		
		// 6. 5번에서 계산한 결제금액으로 1인당 결제금액을 계산해주세요.
		//    1인당 결제금액은 7000원입니다.
		System.out.println("1인당 결제금액은 " + cal3.div(cal3.mul(cal3.add(count1, count2), price), cal3.add(count1, count2)) + "원입니다.");
		
		
		
	}

}
