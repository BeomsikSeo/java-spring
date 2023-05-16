package Static확인문제;

public class 딸 {
	String name;
	char gender;
	static int walletFather = 10000;
	static int count;

	public 딸(String name, char gender) {
		this.name = name;
		this.gender = gender;
		count++;
		walletFather -= 1000;
	}

	@Override
	public String toString() {
		return "딸 [이름=" + name + ", 성별=" + gender + "]";
	}
	
	
}
