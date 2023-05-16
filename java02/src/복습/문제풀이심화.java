package 복습;

import javax.swing.JOptionPane;

public class 문제풀이심화 {

	public static void main(String[] args) {
		// 1) 두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리 후 출력
		// 2) 두 수를 입력받아 정수로 변환하여 정수변수에 저장, 나누기 연산 수행 후 소숫점 2째자리까지 출력!

		// 1)
		String num1 = JOptionPane.showInputDialog("숫자를 입력하세요");
		String num2 = JOptionPane.showInputDialog("하나의 숫자를 더 입력해주세요");
		String cal = JOptionPane.showInputDialog("+, -, *, / 중 하나 입력하세요");
		
		double num11 = Double.parseDouble(num1);
		double num22 = Double.parseDouble(num2);
		
		switch (cal) {
		case "+": 
			System.out.println(num11 + num22);
			break;
		case "-": 
			System.out.println(num11 - num22);
			break;
		case "*": 
			System.out.println(num11 * num22);
			break;
		case "/": 
			System.out.println(num11 / num22);
			break;
		}
		
		
		// 2)
		String num3 = JOptionPane.showInputDialog("정수를 입력하세요");
		String num4 = JOptionPane.showInputDialog("또 다른 정수를 입력하세요");
		
		int num33 = Integer.parseInt(num3);
		int num44 = Integer.parseInt(num4);
		
		double result = (double)num33/num44;
		System.out.printf("%.2f", result);
		
	}

}
