package com.lec.Exercisemember;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.lec.ex02_board.BoardDAOImpl;
import com.lec.ex02_board.BoardFactory;

public class MemberMenu {
	private double ver;
	

	public MemberMenu(double ver) {
		this.ver = ver;
	}
	
	// main menu
	public void mainMenu() throws Exception {
		
		MemberDAOImpl bddao = MemberFactory.getInstance();
		
		while(true) {
			mainMenuText();
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			switch(br.read()) {
			case '1' : bddao.Addmember(); break;
			case '2' : bddao.Viewmembers(); break;
			case '3' : bddao.Viewmemberdetails(0); break;
			case '4' : bddao.Modifymemberinformation(0,"","",""); break;
			case '5' : bddao.Deletememberinformation(0); break;
			case '6' : bddao.Searchbyname(null); break;
			case '7' : bddao.Searchbyemail(null); break;
			case '0' : System.out.println("프로그램 종료"); System.exit(0);
			}
			
		}
		
	

	}

	public void mainMenuText() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("***** 게시판프로그램 V" + ver + "*****\n");
		sb.append("1 . 신규회원등록\n");
		sb.append("2 . 전체회원조회\n");
		sb.append("3 . 회원상세조회\n");
		sb.append("4 . 회원정보수정\n");
		sb.append("5 . 회원정보삭제\n");
		sb.append("6 . 이름으로 검색\n");
		sb.append("7 . 이메일로 검색\n");
		sb.append("0 . 종료\n");
		sb.append("==================================================\n");
		sb.append("처리할 작업번호를 입력하세요");
		System.out.println(sb.toString());
		
	}

	public void mainBoardMenu() {
		MemberDAOImpl bddao = MemberFactory.getInstance();
		
		while(true) {
			int menuNo = mainMenuUi();
			switch(menuNo) {
			case 1 : Addmember(bddao); break;
			case 2 : Viewmembers(bddao); break;
			case 3 : Viewmemberdetails(bddao); break;
			case 4 : Modifymemberinformation(bddao); break;
			case 5 : Deletememberinformation(bddao); break;
			case 6 : Searchbyname(bddao); break;
			case 7 : Searchbyname(bddao); break;
			case 0 : System.out.println("프로그램 종료"); System.exit(0);
			}
		}
		
		
	}


	private void Searchbyname(MemberDAOImpl bddao) {
		// TODO Auto-generated method stub
		
	}

	private void Deletememberinformation(MemberDAOImpl bddao) {
		// TODO Auto-generated method stub
		
	}

	private void Modifymemberinformation(MemberDAOImpl bddao) {
		// TODO Auto-generated method stub
		
	}

	private void Viewmemberdetails(MemberDAOImpl bddao) {
		// TODO Auto-generated method stub
		
	}

	private void Viewmembers(MemberDAOImpl bddao) {
	ArrayList<MemberVo> members = 
		
	}

	private void Addmember(MemberDAOImpl bddao) {
		bddao.Addmember();
		
	}

	private int mainMenuUi() {
		String menuNo = JOptionPane.showInputDialog(
				"===== 회원관리프로그램V 1.0 =====\n\n" +
				"1 . 신규회원등록\n" +
				"2 . 전체회원조회\n" +
				"3 . 회원상세조회\n" +
				"4 . 회원정보수정\n" +
				"5 . 회원정보삭제\n" +
				"6 . 회원이름으로 검색\n" + 
				"7 . 회원이메일로 검색\n" +
				"0 . 종료\n\n" +
				"처리할 작업번호를 입력하세요"
				);
		if((menuNo == null) || (menuNo.equals(""))) {
			return 0;
		}else {
			return Integer.parseInt(menuNo);
		}
		
	}

}






