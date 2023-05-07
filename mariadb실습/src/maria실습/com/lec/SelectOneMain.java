package maria실습.com.lec;

import java.sql.*;
public class SelectOneMain {


	final static String DRV = "org.mariadb.jdbc.Driver";
	final static String URL = "jdbc:mariadb://localhost:3306/emp?user=root&password=12345";
	final static String USR = "root";
	final static String PWD = "12345";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL,USR,PWD);
			String sql = "select * from emp where empno=? and job=?";
			int row = 0;
			
			// emp 테이블 한건씩 읽기
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 7369);
			pstmt.setString(2, "CLERK");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String hiredate = rs.getString("hiredate");
				System.out.println("사원번호 = " + empno + ", 사원이름 = " + ename + ", 입사일자 = " + hiredate);
			}else {
				System.out.println("자료를 찾지 못했습니다.");
			}
		} catch (Exception e) {
			System.out.println("DB연결실패");
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (Exception e2) {
				// dummy
			}
		}

	}

}
