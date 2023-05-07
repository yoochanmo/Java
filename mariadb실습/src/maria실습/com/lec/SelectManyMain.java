package maria실습.com.lec;

import java.sql.*;
public class SelectManyMain {

	final static String DRV = "org.mariadb.jdbc.Driver";
	final static String URL = "jdbc:mariadb://localhost:3306/emp?user=root&password=12345";
	final static String USR = "root";
	final static String PWD = "12345";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	
	public static void main(String[] args) {
		// select * from emp where empno >= ?
		// ? = 7000번으로 설정
		// while(rs.next(){...}

		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL,USR,PWD);
			String sql = "select * from emp where empno>=?";
			
			
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 7000);
			rs = pstmt.executeQuery();
			
			
			System.out.println("=======================================================================");
			System.out.println("사원번호   사원명   직급   매니저   입사일   급여   커미션   부서번호");
			System.out.println("=======================================================================");
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt(4);
				String hiredate = rs.getString("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				System.out.print(empno + "\t");
				System.out.print(ename + "\t");
				System.out.print(job + "\t");
				System.out.print(mgr + "\t");
				System.out.print(hiredate + "\t");
				System.out.print(sal + "\t");
				System.out.print(comm + "\t");
				System.out.println(deptno + "\t");
				
			}
			
		} catch (Exception e) {
			System.out.println("DB연결실패");
			e.printStackTrace();
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
