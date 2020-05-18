package kr.com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnection {
	
	private static Connection conn; // ctrl shift o
	
	private DBConnection() {} //private 선언해서 생성자 호출 안됨
	
	public static Connection getConnection() throws Exception {
		if(conn == null || conn.isClosed()) {
			getConn();
		}
		
		return conn;
	}
	
	private static void getConn() throws Exception{
		
		String url = "jdbc:mariadb://localhost:13306/korea"; //공통, 데이터베이스 접근하기위한 주소
		String driver = "org.mariadb.jdbc.Driver"; // 정해져있음
		String id = "root";
		String passwd = "1234";
		
		//드라이버 로드
		Class.forName(driver);
		
		//드라이버매니저를 통한 데이터베이스 커넥션 연결
		conn = DriverManager.getConnection(url, id, passwd);
		
	}
	
	public static void closeConntecion(PreparedStatement psmt, ResultSet res) {
		
		try {
			if(psmt != null) {
				psmt.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void closeConntecion(ResultSet res) {
		
		try {
			if(res != null) {
				res.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
