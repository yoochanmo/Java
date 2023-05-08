package com.lec.exercise;

import java.sql.*;

public class InsertMain {

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
			sql = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) " + " values(?,?,?,?,?,?,?,?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 9001);
			pstmt.setString(2, "소향");
			pstmt.setString(3, "가수");
			pstmt.setInt(4, 7839);
			pstmt.setString(5, "2023-05-03");
			pstmt.setInt(6, 10000);
			pstmt.setInt(7, 0);
			pstmt.setInt(8, 10);
			int row = pstmt.executeUpdate();
			System.out.println("emp테이블에 " + row + "건이 성공적으로 추가되었습니다!");

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