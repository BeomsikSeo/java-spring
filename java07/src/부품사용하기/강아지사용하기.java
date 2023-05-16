package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 dog1 = new 강아지();
		dog1.leg = 4;
		dog1.nose = "냄새를 잘 맡음";
		dog1.물다();
		System.out.println("dog1의 다리는 " + dog1.leg);
		
		
		
		강아지 dog2 = new 강아지();
		dog2.leg = 4;
		dog2.nose = "뛰어남";
		dog2.짖다();
		System.out.println("dog2의 다리는 " + dog2.leg);
		System.out.println("dog2의 후각은 " + dog2.nose);
	}

}
