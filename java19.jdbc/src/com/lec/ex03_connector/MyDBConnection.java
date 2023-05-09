package com.lec.ex03_connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lec.ex02_board.BoardVo;

public class MyDBConnection {

	public static void main(String[] args) {
		
		Connection conn = JDBCConnector.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement("select * from board");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVo vo = new BoardVo();
				vo.setBno(rs.getInt(1));
				vo.setSubject(rs.getString("subject"));
				vo.setWriter(rs.getString("writer"));
				vo.setContent(rs.getString("content"));
				System.out.println(vo.toString());
			}
		} catch (SQLException e) {
			System.out.println("DB접속 실패");
			
		}finally {
			JDBCConnector.close(conn, pstmt, rs);
		}
	}

}
