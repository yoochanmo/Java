package com.lec.ex01_basic;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEmployeeMain {

	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PWD = "tiger";
	
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		// 실습. select * from empno, ename job from emp;
		// 사원정보를 employee.html(table태그) 출력파일로 저장
	
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL,USR,PWD);
			String sql = "select empno,ename,job from emp";
			stmt =conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			FileWriter fw = new FileWriter("employee.html");
			fw.write("<html><head><title>Employee List</title>"
					+ "</head><body><table border=\"1\"><tr>"
					+ "<th>EmpNo</th>"
					+ "<th>Name</th>"
					+ "<th>Job</th></tr>");
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				
				
				fw.write("\"<tr><td>\"" +empno+ "\"</td>"
						+ "<td>\"" +ename+ "\"</td>"
						+ "<td>\"" +job+ "\"</td></tr>");
			}
			fw.write("</table></body></html>");
			fw.close();
										
		} catch (Exception e) {
			System.out.println("DB연결실패");
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
				if(conn != null)conn.close();
			} catch (Exception e2) {
				// dummy
			}
		}

	}

}