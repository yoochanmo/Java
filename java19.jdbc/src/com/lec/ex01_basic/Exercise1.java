package com.lec.ex01_basic;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercise1 {

	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PWD = "1234";
	
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
        // 실습. select * from empno, ename job from emp;
        // 사원정보를 employee.html(table태그) 출력파일로 저장

		// 오라클 데이터베이스와 연결
    	try (Connection conn = DriverManager.getConnection(URL, USR, PWD);
    			// sql 쿼리호출
    		    PreparedStatement stmt = conn.prepareStatement("SELECT empno, ename, job FROM emp");
    			
    			// sql 쿼리 실행
    		    ResultSet rs = stmt.executeQuery()) {
    		    
    			// 데이터를 담을 변수
    		    String data = "<html><head><title>Employee List</title></head><body><table border=\"1\"><tr>"
    		                  + "<th>empno</th>"
    		                  + "<th>name</th>"
    		                  + "<th>job</th></tr>";
    		    
    		    // while문 루프를 돌려서 하나씩 읽어 데이터 추가
    		    while (rs.next()) {
    		        int empno = rs.getInt("empno");
    		        String ename = rs.getString("ename");
    		        String job = rs.getString("job");

    		        data += "<tr><td>" + empno + "</td>"
    		                + "<td>" + ename + "</td>"
    		                + "<td>" + job + "</td></tr>";
    		    }

    		    data += "</table></body></html>";
    		    // FileWriter을 이용해 html로 출력파일 저장
    		    try (FileWriter fw = new FileWriter("employee.html")) {
    		        fw.write(data);
    		    }
    		    
    		} catch (Exception e) {
    		    System.out.println("DB 연결 실패");
    		    
    		 // 각 객체들이 사용된 후 자동으로 닫히도록함.
    		}finally {
				try {
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
					if(conn != null) conn.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
	}
}

