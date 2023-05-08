package com.lec.Exercisemember;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.lec.ex02_board.ConnectionFactory;

public class MemberDAOImpl implements MemberDAOService {
	
	
	private MemberVo inputMember() {
		MemberVo member = new MemberVo();
		String member_id = JOptionPane.showInputDialog("회원 ID 를 입력하세요");
		String member_pw = JOptionPane.showInputDialog("비밀번호를 입력하세요");
		String member_name = JOptionPane.showInputDialog("회원이름을 입력하세요");
		String member_age = JOptionPane.showInputDialog("회원의 나이를 입력하세요");
		String member_gender = JOptionPane.showInputDialog("회원의 성별을 입력하세요");
		String member_email = JOptionPane.showInputDialog("회원의 이메일을 입력하세요");
		
		member.setMember_id(member_id);
		member.setMember_pw(member_pw);
		member.setMember_name(member_name);
		member.setMember_age(0);
		member.setMember_gender(member_gender);
		member.setMember_email(member_email);
				
		return member;
		
		
	}

	@Override
	public void Addmember() {
		MemberVo member = inputMember();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		String sql = cf.getInsert();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMember_id());
			pstmt.setString(2, member.getMember_pw());
			pstmt.setString(3, member.getMember_name());
			int row = pstmt.executeUpdate();
			System.out.println(row + "건이 성공적으로 등록되었습니다.");
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				
			}
		}

	}
		
		
	

	@Override
	public ArrayList<MemberVo> Viewmembers() {
		ArrayList<MemberVo> memberList = new ArrayList<>();
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect()
					    + " order by bno desc";	
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVo member = new MemberVo();
				member.setMember_id(rs.getString("id"));
				member.setMember_name(rs.getString("name"));
				member.setMember_email(rs.getString("email"));
				memberList.add(member);
			}
					
		} catch (Exception e) {
			System.out.println("전체회원조회 실패!!!");
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	
		return memberList;
	}
		
	

	@Override
	public MemberVo Viewmemberdetails(int bno) {
		
		MemberVo member = new MemberVo();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect() + " where bno = " + bno;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member.setMember_id(rs.getString("id"));
				member.setMember_name(rs.getString("name"));
				member.setMember_email(rs.getString("email"));
			}else {
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return null;
	}

	@Override
	public void Modifymemberinformation(int bno, String subject, String writer, String content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Deletememberinformation(int bno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<MemberVo> Searchbyname(String subject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberVo> Searchbyemail(String writer) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
