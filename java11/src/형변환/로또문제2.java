package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제2 {

	public static void main(String[] args) {
		Random r = new Random(42);
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		for (int i = 0; i < 1000; i++) {
			lotto.add(r.nextInt(1000));
		}
		System.out.println(1000-lotto.size());
		System.out.println(lotto);

	}

}
