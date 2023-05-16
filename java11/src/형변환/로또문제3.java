package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제3 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		for (int i = 0; lotto.size() < 6; i++) { // 중복값 없이 원하는 인덱스를 갖게하는법 (PPT에는 while 문으로 되어있으니 참고)
			lotto.add(r.nextInt(45) + 1); // 1 ~ 45
		}
		System.out.println(lotto.size());
		System.out.println(lotto);

	}

}
