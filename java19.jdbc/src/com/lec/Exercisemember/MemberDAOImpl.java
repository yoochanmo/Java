package com.lec.Exercisemember;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MemberDAOImpl implements MemberDAOService{
	
	public MemberVO inputMember() {
		MemberVO member = new MemberVO();
		
		String id 		= JOptionPane.showInputDialog("ID를 입력하세요");
		String pw 		= JOptionPane.showInputDialog("비밀번호를 입력하세요");
		String name 	= JOptionPane.showInputDialog("이름을 입력하세요");
		String age 		= JOptionPane.showInputDialog("나이를 입력하세요");
		String gender 	= JOptionPane.showInputDialog("성별을 입력하세요");
		String email 	= JOptionPane.showInputDialog("이메일을 입력하세요");
	
		member.setMember_id(id);
		member.setMember_pw(pw);
		member.setMember_name(name);
		member.setMember_age(Integer.parseInt(age));
		member.setMember_gender(gender);
		member.setMember_email(email);
		
		return member;
	}

	public void createMember() {
		MemberVO member = inputMember();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		String sql = cf.getInsert();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMember_id());
			pstmt.setString(2, member.getMember_pw());
			pstmt.setString(3, member.getMember_name());
			pstmt.setInt   (4, member.getMember_age());
			pstmt.setString(5, member.getMember_gender());
			pstmt.setString(6, member.getMember_email());
			int row = pstmt.executeUpdate();
			System.out.println(row + "회원등록이 완료되었습니다.");
			
		} catch (SQLException e) {
			System.out.println("회원 등록에 실패하셨습니다.");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
	}

	public ArrayList<MemberVO> listMember() {
		ArrayList<MemberVO> memberList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO member = new MemberVO();
				member.setMember_id(rs.getString("member_id"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(rs.getString("member_email"));
				memberList.add(member);
			}
		} catch (SQLException e) {
			System.out.println("회원목록 조회 실패");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}		
		return memberList;
	}

	public MemberVO viewMember(String member_id) {

		MemberVO member = new MemberVO();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect() + " where member_id = ?";

		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
	            member.setMember_name(rs.getString("member_name"));
	            member.setMember_id(rs.getString("member_id"));
	            member.setMember_email(rs.getString("member_email"));
			} else {
				System.out.println(member_id + "회원을 찾을 수 없습니다.");
			}
		} catch (SQLException e) {
			System.out.println("회원 조회 실패");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		return member;
	}

	public void updateMember(String member_id) {

		MemberVO member = viewMember(member_id);

		String member_pw 	= JOptionPane.showInputDialog("(수정) PassWord를 입력하세요.", member.getMember_pw());
		String member_name 	= JOptionPane.showInputDialog("(수정) 이름을 입력하세요.", member.getMember_name());
		String member_email = JOptionPane.showInputDialog("(수정) E-Mail을 입력하세요.", member.getMember_email());
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		String sql = cf.getUpdate();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_pw);
			pstmt.setString(2, member_name);
			pstmt.setString(3, member_email);
			pstmt.setString(4, member_id);
			int row = pstmt.executeUpdate();
			System.out.println("회원정보 수정완료");
		} catch (SQLException e) {
			System.out.println("회원정보 수정실패 다시 시도해 주십시오.");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		
		
	}

	public void deleteMember(String member_id) {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		String sql = cf.getDelete();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_id);
			int row = pstmt.executeUpdate();
			System.out.println("삭제 완료");
		} catch (SQLException e) {
			System.out.println("삭제 실패");
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		
	}

	public ArrayList<MemberVO> findByNameMember(String member_name) {

		ArrayList<MemberVO> memberList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect()
				   + " where member_name like '%" + member_name + "%'"
				   + " order by member_name desc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO member = new MemberVO();
				member.setMember_id(rs.getString("member_id"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(rs.getString("member_email"));
				memberList.add(member);
			}
		} catch (SQLException e) {
			System.out.println("회원 이름 조회 실패");
			e.printStackTrace();
		} finally {
			try {				
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		return memberList;
	}

	public ArrayList<MemberVO> findByEmailMember(String member_email) {
		
		ArrayList<MemberVO> memberList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect()
				   + " where member_email like '%" + member_email + "%'"
				   + " order by member_name desc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO member = new MemberVO();
				member.setMember_id(rs.getString("member_id"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(rs.getString("member_email"));
				memberList.add(member);
			}
		} catch (SQLException e) {
			System.out.println("회원 이메일 조회 실패");
			e.printStackTrace();
		} finally {
			try {				
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		return memberList;
		
	}


}

	