package 복습;

public class 배열만들기2 {

	public static void main(String[] args) {
		String[] trip = new String[5];
		trip[0] = "제주도";
		trip[1] = "부산";
		trip[2] = "강릉";
		trip[3] = "속초";
		trip[4] = "여수";
		for (String x : trip) {
			System.out.println(x);
		}
		
		char[] color = {'r', 'b', 'y', 'g', 'b'};
		for (int i = 0; i < color.length; i++) {
			System.out.println(color[i]);
		}
		
		double[] height = {181.1, 175.3, 190.3, 169.3, 178.3};
		for (double d : height) {
			System.out.println(d);
		}

		// 기본형은 다 소문자
		// 참조형은 다 대문자?
	}

}
