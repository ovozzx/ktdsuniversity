package com.ktdsuniversity.tmdb.mkng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class MkngDao {

	public List<MkngVO> getMaking(String mvId){
		
		
		// 1. OracleDriver.class 파일 로드
		try {			
			Class.forName("oracle.jdbc.OracleDriver"); // 동적 로딩, 경로 기억하기 중요!
		} catch (ClassNotFoundException e) {
			System.out.println("OJDBC가 필요합니다.");
			return null;
		}
		
		// 2. Oracle에 연결
		Connection conn = null;
		try {			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "TMDB", "TMDB"); // url, user, pw
		} catch(SQLException e) {
			// 예외 발생 원인 : url 오류 or id 오류 or pw 오류
			System.out.println("데이터베이스에 연결할 수 없습니다.!");
			return null;
		}
		
		// 3. SELECT 쿼리 작성 : 모든 쿼리는 디비버에서 쓴 후 쿼리 그대로 가져오기 (연동 때 * 절대 안 씀)
		// ; 제외하고 복사 -> 문자열로 담기 
		StringBuffer query = new StringBuffer();
		// 문자열 끝에 공백 추가, 안그러면 문자열 모두 하나로 이어짐
		query.append("		SELECT MKNG_ID                   ");
		query.append("		 , MV_ID                         ");
		query.append("		 , STFF_ID                       ");
		query.append("		 , STFF_RL                       ");
		query.append("		 , STFF_PRT                      ");
		query.append("	  FROM MKNG                          ");
		query.append("	 WHERE MV_ID = ?                     ");
				
		// 4. SELECT 쿼리 실행 요청
	    PreparedStatement pstmt = null;
        ResultSet rs = null; // 쿼리 조회 결과 
        
		try {
			
			pstmt = conn.prepareStatement(query.toString()); // 준비
			// 쿼리 파라미터 바인딩 = ?에 데이터를 넣어주겠다!
			pstmt.setString(1, mvId); // (몇번째 물음표 (1부터 시작), 넣을 값)
			// 5. SELECT 쿼리 실행 결과를 받아 옴
			rs = pstmt.executeQuery(); // 실행
		} catch(SQLException e) {
			System.out.println("쿼리가 잘못되었습니다!");
			System.out.println(e.getMessage());	
			
			try {
				conn.close();
				
			} catch(SQLException e1) {} // 오류명 다르게 
			return null;		
			
		}
		
		List<MkngVO> mkngList = new ArrayList<>();
		
		// 6. 출력 
		try {
			MkngVO mkng = null;
			while(rs.next()) { 
				// 결과를 MvVO에 넣음
				mkng = new MkngVO();
				
				mkng.setMkngId(rs.getString("MKNG_ID")); 
				mkng.setMvId(rs.getString("MV_ID")); 
				mkng.setStffId(rs.getString("STFF_ID")); 
				mkng.setStffRl(rs.getString("STFF_RL")); 
				mkng.setStffPrt(rs.getString("STFF_PRT")); 
				
				mkngList.add(mkng);
	
			}
		} catch (SQLException e) {
			System.out.println("컬럼의 이름이나 타입이 잘못되었습니다!");
			System.out.println(e.getMessage());
		} finally {
			try {
				rs.close();
			} catch (SQLException e) {}
			try {
				pstmt.close();
			} catch (SQLException e) {}
			try {
				conn.close();
			} catch (SQLException e) {}
		}
		
				
		return mkngList;
		
		
	}
	
}
