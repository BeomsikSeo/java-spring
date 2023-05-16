package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1  = new Day("자바공부", 8, "삼성역"); // 4개
		System.out.println(Day.count); // 이탤릭체로 누워있는 애들이 static!!!!!
		// 객체생성할때마다 count, sum
		System.out.println(Day.sum);
		// static이 붙은 메서드나 변수는 객체생성하지 않아도
		// 클래스 이름으로 바로 접근해서 사용 가능!!
		
		
		Day day2  = new Day("주변산책", 1, "코엑스근방");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		Day day3  = new Day("시험요약정리", 2, "강의장5");
		System.out.println(Day.count);
		System.out.println(Day.sum);
		// 총 12개 다이나믹 생성, 멤버변수 ==> 객체 생성할 때마다 다이나믹하게 무더기영역(heap)에
		// 생긴 변수를 인스턴스 변수라고 부른다.

		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
	}

}
