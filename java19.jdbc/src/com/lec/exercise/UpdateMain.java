package com.lec.exercise;

import java.sql.*;

public class UpdateMain {
	
	final static String DRV = "org.mariadb.jdbc.Driver";
	final static String URL = "jdbc:mariadb://localhost/board";
	final static String USR = "root";
	final static String PWD = "12345";

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			sql = "update emp set ename=?, sal=?, comm=? where empno=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "나얼");
			pstmt.setInt(2, 2000);
			pstmt.setInt(3, 100);
			pstmt.setInt(4, 9001);
			int row = pstmt.executeUpdate();
			System.out.println("emp테이블에 " + row + "건이 성공적으로 수정되었습니다!");

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
