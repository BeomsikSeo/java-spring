package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		String[] 과목명 = {"국어", "영어", "수학", "컴퓨터", "회화"};
		int[] 학기1성적 = {44, 66, 22, 99, 100};
		int[] 학기2성적 = 학기1성적.clone();
		System.out.println(학기1성적 == 학기2성적); // 주소비교
		
		학기2성적[0] = 22;
		학기2성적[2] = 88;
		
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기1성적[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기2성적[i] + " ");
		}
		System.out.println();
		
		// 1학기, 2학기 성적 중 동일한 성적과목수
		int count = 0;
		int count2 = 0;
		String text = "";
		for (int i = 0; i < 학기2성적.length; i++) {
			if (학기1성적[i] == 학기2성적[i]) {
				count++;
			} else if (학기1성적[i] < 학기2성적[i]) {
				count2++;
				text = text + " " + 과목명[i];
			}
		} // for
		System.out.println("1, 2학기 성적이 동일한 과목수는 " + count + "개");
		System.out.println("2학기에 성적이 오른 과목 수는 " + count2 + "개");
		System.out.println("2학기에 성적이 오른 과목 명은" + text);
	}

}
