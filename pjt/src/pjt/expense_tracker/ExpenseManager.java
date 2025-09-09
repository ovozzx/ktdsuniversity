package pjt.expense_tracker;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExpenseManager {
	
	
	// 1. 가계부 항목 추가 함수 
	/**
	 * 
	 * @param id
	 * @param datetime
	 * @param amount
	 * @param type
	 * @param category
	 * @param memo
	 */
	public void addExpense(int id, String datetime, int amount, 
						   String type, String category, String memo) {
		
		// String datetime이어도 db에는 date 타입으로 반영됨 (테이블 타입을 date로 만들어놔서)
		// Java에서 String을 그대로 INSERT해도 DB가 자동으로 이를 DATE로 변환
		// Java에서 String을 INSERT하면 DB가 자동으로 변환될 수 있지만, 명시적으로 java.sql.Date로 변환하는 것이 더 안전하고, 정확한 방식입니다.
		String query = "INSERT INTO EXPENSE (id, datetime, amount, type, category, memo) VALUES(?, ?, ?, ?, ?, ?)";
		
		DBConnection dbc = new DBConnection();
		Connection conn = dbc.getConnection();
		
		// 3. 쿼리 실행 요청
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, datetime);
			pstmt.setInt(3, amount);
			pstmt.setString(4, type);
			pstmt.setString(5, category);
			pstmt.setString(6, memo);
			pstmt.executeUpdate();
			System.out.println("DB 추가 성공!");
		
		} catch(SQLException se) {
			se.printStackTrace();
		}
		

	
		
	}

}
