package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import 화면DB연결.BbsVO;

public class BbsDAO {

	public BbsVO one(int no) {
		ResultSet rs = null;
		BbsVO bag = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select * from hr.bbs where no = ?"; // DB 컬럼명 대문자로 변경
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			if (rs.next()) {
				System.out.println("검색결과 있음. 성공!");
				int no2 = rs.getInt(1); // no
				String title = rs.getString(2); // title
				String content = rs.getString(3); // content
				String writer = rs.getString(4); // writer
				System.out.println(no2 + " " + title + " " + content + " " + writer);
				
				bag = new BbsVO();
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
			} else {
				System.out.println("검색결과 없음!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;
	}
	
	public void delete(int no) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. 오라클 연결 성공.");

			String sql = "delete from hr.bbs where no = ?"; // DB 컬럼명 대문자로 변경
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(int no, String content) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. 오라클 연결 성공.");

			String sql = "update hr.bbs set content = ? where no = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, content);
			ps.setInt(2, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			ps.executeUpdate(); // insert, update, delete문만!! SQL문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(int no, String title, String content, String writer) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. 오라클 연결 성공.");

			String sql = "insert into hr.bbs values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			ps.setInt(1, no); // ps.setInt(1, no);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
