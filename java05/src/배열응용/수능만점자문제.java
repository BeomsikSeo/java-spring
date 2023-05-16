package 배열응용;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
		// 수능 10000명의 점수를 처리!
		// 랜덤으로 10000명의 점수를 넣어주세요.
		// 0~450
		
		Random r = new Random(42);
		
		Integer[] score = new Integer[10000];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(451);
		}
		
		for (int x : score) {
			System.out.println(x);
		}
	
		System.out.println();
		
		// 1) 만점자가 몇 명인지?? 누구인지(인덱스)
		int count = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 450) {
				count++;
				System.out.println("만점자 인덱스 " + i);
			}
		}
		System.out.println();
		System.out.println("만점자는 총 " + count + "명");
		
		System.out.println();
		// 2) 0점이 몇 명인지??
		int count2 = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] == 0) {
				count2++;
			}
		}
		System.out.println("0점은 총 " + count2 + "명");
		
		System.out.println();
		// 3) 평균은 어떻게 되었는지?? 합계를 먼저 구해야함.
		int sum = 0;
		for (int x : score) {
			sum += x;
		}
		System.out.println("전체 점수의 합은 " + sum);
		double avg = (double)sum / score.length;
		System.out.println("점수의 평균은 " + avg);
		
		System.out.println();
		// 4) 평균보다 +-50점인 학생 카운트
		int count3 = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] >= (avg - 50) && score[i] <= (avg + 50)) {
				count3++;
			}
		}
		System.out.println("평균 +-50인 학생 수는 " + count3);

		System.out.println();
		// 5) 상위 30% 학생의 평균은?
		//  - 배열을 내림차순 정렬 -> Arrays.sort
		//  - 인덱스 0 번부터 length의 30% 번까지의
		//  - 인원, 점수 합계, 평균?
		int scoreHigh = 0; // 상위 30% 학생 수
		int scoreHighSum = 0; // 상위 30% 학생 점수 합계
		Arrays.sort(score, Collections.reverseOrder());
		
		for (int i = 0; i < (score.length*0.3); i++) {
			scoreHigh++;
			scoreHighSum += score[i];
		}
		double scoreHighAvg = (double)scoreHighSum / (score.length*0.3);
		System.out.println("상위 30% 학생의 수는 " + scoreHigh);
		System.out.println("상위 30% 학생 점수의 합은 " + scoreHighSum);
		System.out.println("상위 30% 학생 점수의 평균은 " + scoreHighAvg);
	}

}
