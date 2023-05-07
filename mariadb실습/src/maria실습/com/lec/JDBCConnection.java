package maria실습.com.lec;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCConnection {
	
	final static String DRV = "org.mariadb.jdbc.Driver";
	final static String URL = "jdbc:mariadb://localhost:3306/emp?user=root&password=12345";
	final static String USR = "root";
	final static String PWD = "12345";
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(DRV);// ClassLoader가 메모리(힙)영역에 Connection객체를 로딩
			conn = DriverManager.getConnection(URL, USR, PWD);
			System.out.println("DB연결성공");
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from emp where empno >= 7000");
			rs.next();
			int empno = rs.getInt(1);
			String ename = rs.getString("ename");
			System.out.println(empno + ", " + ename);
			
			
		} catch (Exception e) {
			System.out.println("DB연결실패");
			e.printStackTrace();
		} finally {
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
