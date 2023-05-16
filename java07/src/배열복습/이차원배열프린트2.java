package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		// 꼭 하고 싶은 것 9가지를 작성해서, 전체 프린트
		String[][] s = {
				{"다이어트","취업","백수"},
				{"TV","게임","잠"},
				{"운동","여행","영어"}
		}; // 전체를 프린트!
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
		
	}

}
