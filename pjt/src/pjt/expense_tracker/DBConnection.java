package pjt.expense_tracker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	
	public Connection getConnection() {
		
		Connection conn = null;
		
		// 1. OracleDriver.class 파일 로드
		try {		
			Class.forName("oracle.jdbc.OracleDriver"); 
		} catch(ClassNotFoundException cfe) {
			System.out.println("OJBC가 필요합니다.");
			return null;
		}
		
		// 2. Oracle 연결
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234");
		} catch(SQLException se) {
			System.out.println("DB에 연결할 수 없습니다");
			return null;
			
		}
	
		
		return conn;
		
	}
	
	
		
	
}
