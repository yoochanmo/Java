package com.lec.Exercisemember;

import java.util.ArrayList;



public interface MemberDAOService {
	void Addmember(); // 1 . 신규회원등록
	ArrayList<MemberVo> Viewmembers(); // 2 . 전체회원 조회
	MemberVo Viewmemberdetails(int bno); // 3 . 회원상세 조회
	void Modifymemberinformation(int bno); // 4 . 회원정보수정
	void Deletememberinformation(int bno); // 5 . 회원정보삭제
	
	ArrayList<MemberVo> Searchbyname(String Searchbyname); // 6 . 이름으로 검색
	ArrayList<MemberVo> Searchbyemail(String Searchbyemail); // 7 . email로 검색
}
