package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {
		
		직원 work1 = new 직원("홍길동", 25, "여");
		직원 work2 = new 직원("김길동", 24, "남");
		직원 work3 = new 직원("송길동", 25, "여");
		
		// 1) 우리 회사의 직원수는? (직원뽑을 때마다 자동 count)
		System.out.println(직원.count);
		
		// 2) 우리 회사의 직원 각각의 정보를 프린트
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		
		// 3) 우리 회사의 직원의 평균 나이를 프린트
		System.out.println(직원.sum / (double)직원.count);
		
	}
	
	
}
