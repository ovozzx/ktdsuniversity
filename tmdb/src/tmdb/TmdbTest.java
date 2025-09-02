package tmdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 지울 파일
public class TmdbTest {

	public static void main(String[] args) {
		
		// 1. OracleDriver.class 파일 로드
		try {			
			Class.forName("oracle.jdbc.OracleDriver"); // 동적 로딩, 경로 기억하기 중요!
		} catch (ClassNotFoundException e) {
			System.out.println("OJDBC가 필요합니다.");
			return;
		}
		
		// 	- 오라클 연결을 위한 라이브러리가 연결되었는지 확인
		// 2. Oracle에 연결
		Connection conn = null;
		try {			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "TMDB", "TMDB"); // url, user, pw
		} catch(SQLException e) {
			// 예외 발생 원인 : url 오류 or id 오류 or pw 오류
			System.out.println("데이터베이스에 연결할 수 없습니다.!");
			return;
		}
		
		//	- 오라클 서버에 견결하기 위한 URL + Schema ID + 패스워드
		
		// 3. SELECT 쿼리 작성 : 모든 쿼리는 디비버에서 쓴 후 쿼리 그대로 가져오기 (연동 때 * 절대 안 씀)
		// ; 제외하고 복사 -> 문자열로 담기 
		StringBuffer query = new StringBuffer();
		// 문자열 끝에 공백 추가, 안그러면 문자열 모두 하나로 이어짐
		query.append(" SELECT M.MV_ID ");
		query.append(" , M.PSTR ");
		query.append(" , M.TTL ") ;
		query.append(" , M.LMT_AGE ");
		query.append(" , TO_CHAR(M.OPN_DT, 'YYYY-MM-DD') AS OPN_DT ");
		query.append(" , M.RNNG_TM ");
		query.append(" , M.KWRD ");
		query.append(" , M.SNPSS ");
		query.append(" , CASE M.OPN_STTS ");
		query.append(" WHEN 'O' THEN '개봉중'");
		query.append(" ELSE '개봉예정'");
		query.append(" END AS OPN_STTS ");
		query.append(" , G.GNR_NM ");
		query.append(" , A.ACTR_NM ");
		query.append(" , C.ACTR_RL_NM ");
		query.append(" , S.STFF_NM ");
		query.append(" FROM MV M ");
		query.append(" INNER JOIN MV_GNR MG ");
		query.append(" ON M.MV_ID = MG.MV_ID ");
		query.append(" INNER JOIN GNR G ");
		query.append(" ON MG.GNR_ID = G.GNR_ID ");
		query.append(" INNER JOIN CST C ");
		query.append(" ON M.MV_ID = C.MV_ID ");
		query.append(" INNER JOIN ACTR A ");
		query.append(" ON C.ACTR_ID = A.ACTR_ID ");
		query.append(" INNER JOIN MKNG MK ");
		query.append(" ON M.MV_ID = MK.MV_ID ");
		query.append(" INNER JOIN STFF S ");
		query.append(" ON S.STFF_ID = MK.STFF_ID ");
		query.append(" WHERE M.MV_ID = 'MV-20250901-000002' ");
		
		// 4. SELECT 쿼리 실행 요청
		// 쿼리 파라미터 : 영화의 아이디 
		// 오라클 연결 객체 (Connection)를 통해서 쿼리 실행을 요청
        PreparedStatement pstmt = null;
        ResultSet rs = null; // 쿼리 조회 결과 
        
		try {
			pstmt = conn.prepareStatement(query.toString()); // 준비
			// 5. SELECT 쿼리 실행 결과를 받아 옴
			rs = pstmt.executeQuery(); // 실행
		} catch(SQLException e) {
			// 쿼리문이 잘못되었을 때 
			System.out.println("쿼리가 잘못되었습니다!");
			System.out.println(e.getMessage());	
			// IO --> Java와 외부 다른 시스템과 연동을할 때 파이프를 생성
			// Connection에 대한 파이프를 끊는다
			
			try {
				conn.close();
				
			} catch(SQLException e1) {} // 오류명 다르게 
			return;		
			
		}

		// 6. 출력 
		// 건수를 모르니 while 씀
		try {
			while(rs.next()) { // 반복마다 row 1개씩 가져 옴
				// 중복 제거는 자바에서 함 
				// 분해해서 가져 옴
				String movieId = rs.getString("MV_ID");
				String posterUrl = rs.getString("PSTR");
				String title = rs.getString("TTL");
				int limitAge = rs.getInt("LMT_AGE");
				String openDate = rs.getString("OPN_DT");
				int runningTime = rs.getInt("RNNG_TM");
				
				System.out.println(movieId);
				System.out.println(posterUrl);
				System.out.println(title);
				System.out.println(limitAge);
				System.out.println(openDate);
				System.out.println(runningTime);
				System.out.println((runningTime / 60) + "시간 " + (runningTime % 60) + "분 ");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("컬럼의 이름이나 타입이 잘못되었습니다!");
			System.out.println(e.getMessage());
		} finally {
			// IO 처리
			// Pipe : Connection, preparedStatement, ResultSet 순서대로 열려있음
			// 닫는 순서 (열린 순서 역순) : ResultSet, preparedStatement, Connection => 메모리 누수 방지
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
		
		
	}
	
}
