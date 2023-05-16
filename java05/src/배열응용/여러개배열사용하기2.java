package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 1. 2학기에 성적이 오른 학생 몇명??
		int count1 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1++;
			} // if
		} // for
		System.out.println("2학기에 성적이 오른 학생은 " + count1 + "명");
		System.out.println();

		// 2. 1학기, 2학기 성적이 동일한 학생 몇명?
		int count2 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count2++;
			} // if
		} // for
		System.out.println("1-2학기 성적이 동일한 학생은 " + count2 + "명");
		System.out.println();

		// 3. 2학기 학생 중 만점(100)인 학생의 이름과 번호는?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 학생 중 만점인 학생의 이름은 " + names[i] + "이고,\n번호는 " + (i + 1) + "번");
			} // if
		} // for
		System.out.println();

		// 4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요??
		int sum1 = 0; // 1학기 합계
		int sum2 = 0; // 2학기 합계
		for (int i = 0; i < term2.length; i++) {
			sum1 += term1[i];
			sum2 += term2[i];
		} // for
		double avg1 = (double)sum1 / term1.length;
		double avg2 = (double)sum2 / term2.length;
		
		if (avg1 > avg2) {
			System.out.println("1학기 성적의 평균이 2학기 성적의 평균보다 높습니다");
		} else if (avg1 < avg2) {
			System.out.println("2학기 성적의 평균이 1학기 성적의 평균보다 높습니다");
		} else {
			System.out.println("1학기 성적의 평균과 2학기 성적의 평균이 같습니다");
		}
		System.out.println();
		
		// 5. 심화) 뉴진스의 1학기 성적, 2학기 성적은?
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("뉴진스")) {
				System.out.println(names[i] + "의 1학기 성적은 " + term1[i] + "점,\n2학기 성적은 " + term2[i] + "점");
			} // if
		} // for
	}

}
