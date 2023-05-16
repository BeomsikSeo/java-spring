package com.multi.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BbsDAO {

	public ArrayList<BbsVO> list() {

		// 가방들 넣어줄 큰 컨테이너 역할을 해 줄 부품이 필요!
		// ArrayList<MemberVO> ==> MemberVO만 들어간 arraylist라는 의미
		// <> 안에 써주는 내용은 추후 설명예정
		ArrayList<BbsVO> list = new ArrayList<>();

		BbsVO bag = null;

		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// java.util.Locale.setDefault(java.util.Locale.US); -- 맥 유저들만!!!

			// 2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서, String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL 부품으로 만들어주어야 함.
			// PreparedStatement가 SQL 부품

			String sql = "select * from bbs";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			// 삭제!!! ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			ResultSet rs = ps.executeQuery(); // select문 전송시
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			// select 문은 검색결과가 없더라도 항상 항목(컬럼)명을 보내주기때문에
			// 값 없는 경우를 null 로 체크하면 안 됨!!
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색결과가 있으면
				// System.out.println("검색결과 있음. 성공.");
				// 2. 각 컬럼에서 값들을 꺼내오자.
				int no = rs.getInt(1); // id
				String title = rs.getString(2); // id
				String content = rs.getString(3); // id
				String writer = rs.getString(4); // id
				// System.out.println(id2 + " " + pw + " " + name + " " + tel);
				// 검색결과를 검색화면 UI부분으로 주어야 함
				// 3. 가방을 만들자
				bag = new BbsVO();
				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

				// 4. list에 bag을 추가해주자.
				list.add(bag);
			} // 검색결과가 있는지 없는지는 list의 사이즈가 0인지 아닌지로 체크가능!
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// return id, pw, name, tel은 xxxx!! 여러값 리턴은 파이썬만 됨
		// return 뒤에는 반드시 여러 데이터를 묶어서 리턴해주어야 함
		// 검색결과가 있을 때는 bag에 데이터가 들어있음.
		// 검색결과가 없을 때는 bag에 무엇이 들어있나? => 맨 처음에 변수 선언시 넣었던 null!

		return list;

	}
	
	public BbsVO one(int no) {
		ResultSet rs = null;
		BbsVO bag = null;

		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// java.util.Locale.setDefault(java.util.Locale.US); -- 맥 유저들만!!!

			// 2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공.");

			String sql = "select * from bbs where no = ?"; // DB 컬럼명 대문자로 변경
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			rs = ps.executeQuery(); // select의 결과는 <항목명+Row> 테이블!!
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
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// java.util.Locale.setDefault(java.util.Locale.US); -- 맥 유저들만!!!

			// 2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공.");

			String sql = "delete from bbs where no = ?"; // DB 컬럼명 대문자로 변경
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, no);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void update(BbsVO bag) {

		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// java.util.Locale.setDefault(java.util.Locale.US); -- 맥 유저들만!!!

			// 2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공.");

			String sql = "update bbs set content = ? where no = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getContent());
			ps.setInt(2, bag.getNo());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			ps.executeUpdate(); // insert, update, delete문만!! SQL문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(BbsVO bag) {

		try {
			// 1. 오라클 11g와 연결할 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. mySQL과 자바 연결할 부품 설정 성공.");
			// java.util.Locale.setDefault(java.util.Locale.US); -- 맥 유저들만!!!

			// 2. 오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezone=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. mySQL 연결 성공.");

			String sql = "insert into bbs(title, content, writer) values (?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			ps.setString(1, bag.getTitle());
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
