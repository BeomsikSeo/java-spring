package 배열복습;

public class 스트링과배열2 {

	public static void main(String[] args) {
		// 전화번호 입력 >>      011-245-1234     
		// 1) 양쪽 공백을 제거하시오.
		// 2) -을 기준으로 분리해내세요.(String[])
		// 3) 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 Apple
		// 4) 두번째 문자열의 길이가 4개 이상이면 최신폰, 아니면 올드폰
		// 5) 전체 전화번호의 길이가 10글자 이상이면 유효한 전화번호
		//    아니면 유효하지 않은 전화번호
		
		String s = "    011-245-1234     ";
		String s2 = s.trim(); // 공백제거
		System.out.println(s2.length()); // 12
		
		// -를 기준으로 문자열을 3개로 분리
		String[] s3 = s2.split("-"); // {"011", "245", "1234"}
		System.out.println(s3[0]); // 3
		System.out.println(s3[1]);
		System.out.println(s3[2]); // 4
		
		// 배열의 첫번째 문자열을 구분
		if (s3[0].equals("011")) {
			System.out.println("SK");
		} else if (s3[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}

		// 배열의 두번째 문자열을 길이 구분
		if (s3[1].length() >= 4) {
			System.out.println("최신폰");
		}  else {
			System.out.println("올드폰");
		}
		
		int count = 0;
		for (int i = 0; i < s3.length; i++) {
			count += s3[i].length();
		}
		if (count >= 10) {
			System.out.println("유효한 전화번호");
		} else
			System.out.println("유효하지 않은 전화번호");
		
		int total = s3[0].length() + s3[1].length() + s3[2].length();
		System.out.println(total);
		if (total >= 10) {
			System.out.println("유효한 전화번호");
		} else
			System.out.println("유효하지 않은 전화번호");
		
		int total2 = 0;
		for (int i = 0; i < s3.length; i++) {
			total2 = total2 + s3[i].length();
		}
		System.out.println(total2);
		
		System.out.println(s2);
		String s222 = s2.replace("-", "");
		System.out.println(s222);
	}

}
