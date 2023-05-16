package com.multi.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;


@Component
public class BookDAO {

	public ArrayList<BookVO> list() {

		ArrayList<BookVO> list = new ArrayList<BookVO>();
		BookVO bag = null;
		
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

			String sql = "select * from book"; // DB 컬럼명 대문자로 변경
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			ResultSet rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			
			while (rs.next()) {
				bag = new BookVO();
				bag.setId(rs.getInt("id"));
				bag.setName(rs.getString("name"));
				bag.setUrl(rs.getString("url"));
				bag.setImg(rs.getString("img"));
				
				list.add(bag);
			} 

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public BookVO one(int id) {

		BookVO bag = null;
		
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

			String sql = "select * from book where id = ?"; // DB 컬럼명 대문자로 변경
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			ResultSet rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			
			if (rs.next()) {
				bag = new BookVO();
				bag.setId(rs.getInt("id"));
				bag.setName(rs.getString("name"));
				bag.setUrl(rs.getString("url"));
				bag.setImg(rs.getString("img"));
			} else {
				System.out.println("검색결과 없음");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bag;
	}
	
	public int delete(int id) {

		int result = 0;
		
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

			String sql = "delete from book where id = ?"; // DB 컬럼명 대문자로 변경
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int update(BookVO bag) {

		int result = 0;
		
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

			String sql = "update book set url = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, bag.getUrl());
			ps.setInt(2, bag.getId());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate(); // insert, update, delete문만!! SQL문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public int insert(BookVO bag) {

		int result = 0;
		
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

			String sql = "insert into book values (null, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement

			ps.setString(1, bag.getName());
			ps.setString(2, bag.getUrl());
			ps.setString(3, bag.getImg());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기.");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}
