package com.lec.ex02_board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.security.auth.Subject;
import javax.swing.JOptionPane;

public class BoardDAOImpl implements BoardDAOService {

	private BoardVo inputBoard() {
		BoardVo board = new BoardVo();
		String subject = JOptionPane.showInputDialog("글제목을 입력하세요");
		String writer = JOptionPane.showInputDialog("작성자를 입력하세요");
		String content = JOptionPane.showInputDialog("본문글을 입력하세요");

		board.setSubject(subject);
		board.setWriter(writer);
		board.setContent(content);
		return board;

	}

	@Override
	public void createBoard() {
		BoardVo board = inputBoard();

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
			System.out.println(row + "건이 성공적으로 등록되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

	@Override
	public ArrayList<BoardVo> listBoard() {
		ArrayList<BoardVo> boardList = new ArrayList<>();

		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect()

				+ " where rownum between 1 and 10" + " order by bno desc";

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BoardVo board = new BoardVo();
				board.setBno(rs.getInt(1));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				boardList.add(board);
			}
		} catch (SQLException e) {
			System.out.println("게시글목록 조회 실패");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return boardList;
	}

	@Override
	public BoardVo viewBoard(int bno) {

		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVo board = null;
		String sql = cf.getSelect() + " where bno = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new BoardVo();
				board.setBno(rs.getInt(1));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				System.out.println("글 조회 성공");
			}else {
				System.out.println("글번호(" + bno + ") -  게시글이 없습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {

			}
		}
		return board;
	}

	@Override
	public void updateBoard(int bno, String subject, String writer, String content) {
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVo board = null;
		String sql = "update board set subject=?, writer=?, content=? where bno=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, subject);
			pstmt.setString(2, writer);
			pstmt.setString(3, content);
			pstmt.setInt(4, bno);

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("글 수정 성공");
			} else {
				System.out.println("글 수정 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public void deleteBoard(int bno) {
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVo board = null;
		String sql = cf.getDelete();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			int row = pstmt.executeUpdate();
			System.out.println("글 삭제 성공");
		} catch (Exception e) {
			System.out.println("글 삭제 실패");
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public ArrayList<BoardVo> findBySubjectBoard(String subject) {
		ArrayList<BoardVo> boardList = new ArrayList<>();
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
				BoardVo board = new BoardVo();
				board.setBno(rs.getInt(1));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				boardList.add(board);
			}
			
		} catch (Exception e) {
			System.out.println("게시글 목록 by 제목 조회 실패");
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
														
		return boardList;
	}

	@Override
	public ArrayList<BoardVo> findBywriterBoard(String writer) {
		ArrayList<BoardVo> boardList = new ArrayList<>();
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect() 
				+ " where subject like '%" + writer + "%'"
				+ " order by bno desc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVo board = new BoardVo();
				board.setBno(rs.getInt(1));
				board.setSubject(rs.getString("subject"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				boardList.add(board);
			}
			
		} catch (Exception e) {
			System.out.println("게시글 목록 by 작성자 조회 실패");
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
														
		return boardList;
	}
}
