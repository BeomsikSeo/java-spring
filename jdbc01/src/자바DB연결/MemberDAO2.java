package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//테이블 하나당 DAO하나! ==> CUD를 완성!!
public class MemberDAO2 {

	// 메서드를 만드는 것 ==> 메서드 정의(define)!
	// 메서드를 정의했다고 실행되는 것은 아니다.!
	// 메서드를 쓰는 것 ==> 메서드 호출(call)!
	public int delete(String id) {
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			// java.util.Locale.setDefault(java.util.Locale.US); -- 맥 유저들만!!!

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

			String sql = "delete from hr.member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

	public int update(String id, String tel) {
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			// java.util.Locale.setDefault(java.util.Locale.US); -- 맥 유저들만!!!

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

			String sql = "update hr.member set tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, tel);
			ps.setString(2, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // insert, update, delete문만!! SQL문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}

	// public void add2() {
	public int insert(String id, String pw, String name, String tel) {
		int result = 0;
		
		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			// java.util.Locale.setDefault(java.util.Locale.US); -- 맥 유저들만!!!

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

			// public void insert(String id, String pw, String name, String tel)
			String sql = "insert into hr.MEMBER values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// con 부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			// R빼고, 대부분의 모든 언어는 인덱스 0부터 시작!!
			// 유일하게 DB는 인덱스가 1부터 시작!!
			ps.setString(1, id); // ps.setInt(1, no);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			// ==> insert into hr.MEMBER values ('a','a','a','a');
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("회원가입 성공!");
			}
			// System.out.println(result);
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행
			// result = 0;
			e.printStackTrace();
		}

		System.out.println(result);
		return result;
		
	}

}
