package maria실습.com.lec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class SelectJoinMain {

	final static String DRV = "org.mariadb.jdbc.Driver";
	final static String URL = "jdbc:mariadb://localhost:3306/emp?user=root&password=12345";
	final static String USR = "root";
	final static String PWD = "12345";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) throws Exception {
		// 실습 부
		// select empno, ename, deptno, dname 
		// from emp emo dept dpt
		// where emp.deptno = ? 
		// and emp.deptno = dpt.deptno;
		// 사원번호 사원이름 부서번호 부서이름
		
		String deptno = JOptionPane.showInputDialog("부서번호를 입력하세요");
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL,USR,PWD);
			String sql = "select empno, ename, emp.deptno, dname "
					+" from emp emp,dept dpt "
					+" where emp.deptno = ? "
					+" and emp.deptno = dpt.deptno";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(deptno));
			rs = pstmt.executeQuery();
			
			System.out.println("==================================================");
			System.out.println("사원번호\t\t사원이름\t\t부서번호\t\t부서명");
			System.out.println("==================================================");
			
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				int dno = rs.getInt(3);
				String dname = rs.getString(4);
				System.out.print(empno + "\t");
				System.out.print(ename + "\t");
				System.out.print(dno + "\t");
				System.out.println(dname + "\t");
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