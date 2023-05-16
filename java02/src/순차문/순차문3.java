package 순차문;

// 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("키를 입력하세요(m)");
		String weight = JOptionPane.showInputDialog("몸무게를 입력하세요(kg)");
		
		double weight1 = Double.parseDouble(weight);
		double height1 = Double.parseDouble(height);
		
		double result = weight1 / (height1 * height1);
		
		System.out.println("나의 bmi 지수는 " + result);
		JOptionPane.showMessageDialog(null, result);

	}

}
