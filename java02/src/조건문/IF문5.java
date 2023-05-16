package 조건문;

public class IF문5 {

	public static void main(String[] args) {
				   // 0123456 각 자리에 해당하는 위치 숫자 (0부터 시작함)
		String ssn = "1011011"; // 주민 번호 뒷자리
				
		// String은 기본형 데이터가 아니여서 비교할 때 명령어(함수)를 사용해야함. ==로 비교 불가
		if (ssn.equals("1011011")) {
			System.out.println("동일한 지역에서 태어나셨군요!!");
		} else {
			System.out.println("동일한 지역에서 태어난게 아니시군요!!!");
		}
		
		char gender = ssn.charAt(0); // 첫번째 자리에 있는 문자 하나 추출
		
		switch (gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		}
	}

}
