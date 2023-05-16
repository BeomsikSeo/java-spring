package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vo.P_orderVO;

public class P_orderDAO {

	public P_orderVO one(int no) {
		ResultSet rs = null;
		P_orderVO bag = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. 오라클 연결 성공.");

			String sql = "select hr.p_menu.store, hr.p_store.category, hr.p_menu.name, hr.p_menu.price from hr.p_menu, hr.p_store "
					+ "where hr.p_menu.store = hr.p_store.name and hr.p_menu.no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) { 
				
				System.out.println("검색결과 있음. 성공.");
				String store = rs.getString(1);
				String category = rs.getString(2);
				String menu_name = rs.getString(3);
				int price = rs.getInt(4);
				
				bag = new P_orderVO();
				bag.setStore(store);
				bag.setCategory(category);
				bag.setMenu_name(menu_name);
				bag.setPrice(price);
				
			} else {
				System.out.println("검색결과 없음.");
			}
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bag;
		
	}

	// public void add2() {
	public int insert(P_orderVO bag) {
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
			String sql = "insert into hr.p_order values (hr.po_no_seq.nextval, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// con 부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			// R빼고, 대부분의 모든 언어는 인덱스 0부터 시작!!
			// 유일하게 DB는 인덱스가 1부터 시작!!
			ps.setInt(1, bag.getMenu_no());
			ps.setString(2, bag.getId());
			// ==> insert into hr.MEMBER values ('a','a','a','a');
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // 1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			// System.out.println(result);
			ps.close();
			con.close();
		} catch (Exception e) {
			// insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			// catch가 실행
			// result = 0;
			e.printStackTrace();
		}

		return result;
		
	}
	
}
