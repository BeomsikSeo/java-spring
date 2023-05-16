package 배열복습;

import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정렬을 할 때는 Arrays
		Random r = new Random(42); // 씨앗값(seed)
		int[] jumsu = new int[10000];
		// for : 입력, 출력, i(인덱스) 활용 가능
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1;
		}
		// for-each : 알아서 위치값을 옮겨주면서 하나씩 꺼내옵니다.!!!
		//            출력용!! 입력 불가
		
		for (int x : jumsu) {
			System.out.println(x);
		}
		// 정렬(sort) : 오름차순 (작-->큰), 내림차순 (큰-->작)
		Arrays.sort(jumsu); // 오름차순
		// sort(jumsu) ==> jumsu가 바뀌어버림 (RAM에 저장된 데이터 원본이 파괴)
		// 파괴형 함수
		
		String n = JOptionPane.showInputDialog("숫자입력");
		int n2 = Integer.parseInt(n);
		// parseInt(n) ==> RAM에 저장된 n의 데이터가 변경된 건 아님 (원본이 비파괴)
		// 비파괴형 함수
		// 비파괴형이 훨씬 많음. 파괴형 함수 나올때마다 확인 필요함
		
		System.out.println("----------------------");
		
		// 정렬 후, 확인
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		// 정렬 후 최대값, 최소값을 프린트!
		System.out.println("최소값: " + jumsu[0]);
		System.out.println("최대값: " + jumsu[jumsu.length - 1]); // 배열 마지막 주소
		
		// 상위 30%, 인원 3000명, 높은 점수부터 3000개 추출
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30 = sum30 + jumsu[i]; // sum += i;
		}
		
		System.out.println("상위 30% 평균 : " + sum30 / 3000.0);
		
		// 하위 30% 평균
		int sum300 = 0;
		for (int i = 0; i < 3000; i++) {
			sum300 += jumsu[i];
		}
		
		System.out.println("상위 30% 평균 : " + sum300 / 3000.0);
		String result = Arrays.toString(jumsu); // 비파괴, String
		System.out.println(result);
	
	}

}
