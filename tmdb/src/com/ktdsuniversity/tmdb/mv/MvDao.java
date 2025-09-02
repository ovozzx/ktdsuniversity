package com.ktdsuniversity.tmdb.mv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MvDao {

	public MvVO getMovie(String mvId) {
		
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
		query.append("  	SELECT MV_ID                                   ");
		query.append("  	 , PSTR                                        ");
		query.append("  	 , TTL                                         ");
		query.append("  	 , LMT_AGE                                     ");
		query.append("  	 , TO_CHAR(OPN_DT, 'YYYY-MM-DD') AS OPN_DT     ");
		query.append("  	 , RNNG_TM                                     ");
		query.append("  	 , KWRD                                        ");
		query.append("  	 , SNPSS                                       ");
		query.append("  	 , ORGNL_TTL                                   ");
		query.append("     , CASE OPN_STTS                                 ");
		query.append("          WHEN 'O' THEN '개봉중'                       ");
		query.append("          ELSE '개봉예정'                              ");
		query.append("        END AS OPN_STTS                              ");
		query.append("  	 , ORGNL_LNGG                                  ");
		query.append("  	 , PRDCT_FEE                                   ");
		query.append("  	 , PRFT                                        ");
		query.append("  FROM MV                                            ");
		query.append("  WHERE MV_ID = ?               "); // 쿼리 바인딩
				
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
		
		MvVO movie = new MvVO();
		
		// 6. 출력 
		try {
			while(rs.next()) { 
				// 결과를 MvVO에 넣음
				movie.setMvId(rs.getString("MV_ID")); 
				movie.setPstr(rs.getString("PSTR")); 
				movie.setTtl(rs.getString("TTL")); 
				movie.setLmtAge(rs.getInt("LMT_AGE")); 
				movie.setOpnDt(rs.getString("OPN_DT")); 
				movie.setRnngTm(rs.getInt("RNNG_TM")); 
				movie.setKwrd(rs.getString("KWRD")); 
				movie.setSnpss(rs.getString("SNPSS")); 
				movie.setOrgnlTtl(rs.getString("ORGNL_TTL")); 
				movie.setOpnStts(rs.getString("OPN_STTS")); 
				movie.setOrgnlLngg(rs.getString("ORGNL_LNGG")); 
				movie.setPrdctFee(rs.getInt("PRDCT_FEE")); 
				movie.setPrft(rs.getLong("PRFT")); 
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
		
				
		return movie;
		
	}
}
