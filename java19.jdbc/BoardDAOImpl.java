package com.lec.ex02_board;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BoardDAOImpl implements BoardDAOService {

	private BoardVO inputBoard() {
		BoardVO board = new BoardVO();
		
		String subject = JOptionPane.showInputDialog("글제목을 입력하세요!");
		String writer  = JOptionPane.showInputDialog("작성자를 입력하세요!");
		String content = JOptionPane.showInputDialog("본문글을 입력하세요!");
		
		board.setSubject(subject);
		board.setWriter(writer);
		board.setContent(content);
		return board;
	}
	
	@Override
	public void createBoard() {
		BoardVO board = inputBoard();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		String sql = cf.getInsert();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getSubject());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			int row = pstmt.executeUpdate();
			System.out.println(row + "건이 성공적으로 등록되었습니다!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public ArrayList<BoardVO> listBoard() {
		ArrayList<BoardVO> boardList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect()
				   + " where rownum between 1 and 10"
				   + " order by bno desc";	
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setBno(rs.getInt(1));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				boardList.add(board);
			}
		} catch (SQLException e) {
			System.out.println("게시글목록 조회 실패!!!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
		return boardList;
	}

	@Override
	public BoardVO viewBoard(int bno) {
		
		BoardVO board = new BoardVO();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect() + " where bno = " + bno;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board.setBno(bno);
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
			} else {
				System.out.println("글번호(" + bno + ") - 게시글이 없습니다!!");
			}
		} catch (Exception e) {
			System.out.println("게시글 조회 실패!!!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}	
		return board;
	}

	@Override
	public void updateBoard(int bno) {
		// BoardVO board = inputBoard();
		// update board set subject=?, .... where bno = 10;
		BoardVO board = viewBoard(bno);
		
		String subject = JOptionPane.showInputDialog("글제목을 입력하세요!", board.getSubject());
		String content = JOptionPane.showInputDialog("본문글을 입력하세요!", board.getContent());
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		String sql = cf.getUpdate();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, subject);
			pstmt.setString(2, content);
			pstmt.setInt(3, bno);
			int row = pstmt.executeUpdate();			
			System.out.println("글번호(" + bno + ") - 게시글이 성공적으로 수정되었습니다!!");
		} catch (Exception e) {
			System.out.println("게시글 수정 실패!!!");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public void deleteBoard(int bno) {
		// delete from board where bno = 10;
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		String sql = cf.getDelete();	
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			int row = pstmt.executeUpdate();
			System.out.println("글번호(" + bno + ") - 게시글이 성공적으로 삭제되었습니다!!");
		
		} catch (Exception e) {
			System.out.println("게시글 삭제 실패!!!");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	@Override
	public ArrayList<BoardVO> findBySubjectBoard(String subject) {
		ArrayList<BoardVO> boardList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect() 
				   + " where subject like '%" + subject + "%'"
				   + " order by bno desc";
		
		try {	
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setBno(rs.getInt(1));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));				
				boardList.add(board);
			}
			
			
		} catch (Exception e) {
			System.out.println("게시글 목록(by 제목) 조회 실패!!!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}		
		return boardList;
	}

	@Override
	public ArrayList<BoardVO> findByWriterBoard(String writer) {
		ArrayList<BoardVO> boardList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect() 
				   + " where writer like '%" + writer + "%'"
				   + " order by bno desc";
		
		try {	
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setBno(rs.getInt(1));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));				
				boardList.add(board);
			}
			
			
		} catch (Exception e) {
			System.out.println("게시글 목록(by 제목) 조회 실패!!!");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}		
		return boardList;
	}

}
