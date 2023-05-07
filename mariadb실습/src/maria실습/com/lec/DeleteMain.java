package maria실습.com.lec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteMain {

	final static String DRV = "org.mariadb.jdbc.Driver";
	final static String URL = "jdbc:mariadb://localhost:3306/emp?user=root&password=12345";
	final static String USR = "root";
	final static String PWD = "12345";

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			
			sql = "delete from emp where empno=?";
			
			// 레코드삭제하기
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 9001);
			int row = pstmt.executeUpdate();
			System.out.println("emp테이블에 " + row + "건이 성공적으로 삭제되었습니다!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				// dummy
			}
		}

	}

}
