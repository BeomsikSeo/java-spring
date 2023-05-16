package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DB연결테스트2 {

	public static void main(String[] args) {
		// 1. 오라클 11g와 연결할 부품 설정
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			//	java.util.Locale.setDefault(java.util.Locale.US); -- 맥 유저들만!!!
			
			// 2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. 오라클 연결 성공.");
			
			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL 부품으로 만들어주어야 함.
			// PreparedStatement가 SQL 부품
			
			String sql = "insert into hr.bbs values (7, '화요일2', '일주 중 2번째 날', 'apple')";
			// DB는 이중따옴표와 싱글따옴표 구분을 안하기 때문에 괄호안에 싱글따옴표를 넣어줌 (이중은 오류남)
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// con 부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
