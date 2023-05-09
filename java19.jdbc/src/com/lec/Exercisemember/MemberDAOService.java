package com.lec.Exercisemember;

import java.util.ArrayList;



public interface MemberDAOService {
	void createMember(); // 1 . 신규회원등록
	ArrayList<MemberVO> listMember(); // 2 . 전체회원 조회
	MemberVO viewMember(String member_id); // 3 . 회원상세 조회
	void updateMember(String member_id); // 4 . 회원정보수정
	void deleteMember(String member_id); // 5 . 회원정보삭제
	
	ArrayList<MemberVO> findByNameMember(String member_name); // 6 . 이름으로 검색
	ArrayList<MemberVO> findByEmailMember(String member_email); // 7 . email로 검색
	
}
