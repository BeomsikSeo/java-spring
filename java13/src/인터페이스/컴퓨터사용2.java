package 인터페이스;

public class 컴퓨터사용2 {

	public static void main(String[] args) {
		// 익명클래스!!!
		Computer com = new Computer() {
		// 인터페이스는 불완전하기때문에 이것을 틀로 해서 객체생성 불가능!!!!!
		// 인터페이스의 구체적인 내용을 구현한 이름없는 클래스가 생성됨!!
			
			@Override
			public void 전원을켜다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 모니터를연결하다() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void 게임을하다() {
				// TODO Auto-generated method stub
				
			}
		};

	}

}
