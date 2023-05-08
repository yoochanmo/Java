package com.lec.ex02_board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BoardMenu {
	
	private double ver;
	
	public BoardMenu(double ver) {
		this.ver = ver;
	}
	
	// main menu
	public void mainMenu() throws Exception {
		
		BoardDAOImpl bddao = BoardFactory.getInstance();
		
		while(true) {
			mainMenuText();
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			switch((char)br.read()) {
			case '1': bddao.createBoard(); break;
			case '2': bddao.listBoard(); break;
			case '3': bddao.viewBoard(0); break;
			case '4': bddao.updateBoard(0); break;
			case '5': bddao.deleteBoard(0); break;
			case '6': bddao.findBySubjectBoard(null); break;
			case '7': bddao.findByWriterBoard(null); break;
			case '0': System.out.println("프로그램종료!!"); System.exit(0);
			}
		}
	}

	public void mainMenuText() {
	
		StringBuffer sb = new StringBuffer();
		sb.append("***** 게시판프로그램 V" + ver + "*****\n");
		sb.append("1. 새로운 글쓰기\n");
		sb.append("2. 전체글 목록 조회\n");
		sb.append("3. 본문글 보기\n");
		sb.append("4. 본문글 수정\n");
		sb.append("5. 본문글 삭제\n");
		sb.append("6. 제목으로 게시글 조회\n");
		sb.append("7. 작성자로 게시글 조회\n");
		sb.append("0. 종료\n");
		sb.append("===========================\n");
		sb.append("처리할 작업번호를 입력하세요");
		System.out.println(sb.toString());		
	}

	public void mainBoardMenu() {
		BoardDAOImpl bddao = BoardFactory.getInstance();
		
		while(true) {
			int menuNo = mainMenuUi();
			
			switch(menuNo) {
			case 1: makeBoard(bddao); break;
			case 2: listBoard(bddao); break;
			case 3: contentView(bddao); break;
			case 4: updateBoard(bddao); break;
			case 5: deleteBoard(bddao); break;
			case 6: findBySubject(bddao); break;
			case 7: findByWriter(bddao); break;
			case 0: System.out.println("프로그램종료!!"); System.exit(0);
			}			
		}
		
	}

	private void findByWriter(BoardDAOImpl bddao) {
		String writer = JOptionPane.showInputDialog("검색할 작성자를 입력하세요!!");
		ArrayList<BoardVO> boards = bddao.findByWriterBoard(writer);
		// select * from board where writer like '%홍%';
		// listBoard와 유사한 로직
		// writer가 null or 공란인지 체크
		System.out.println("================================");
		System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
		System.out.println("================================");
		
		for(BoardVO board:boards) {
			System.out.println(board.toString());
		}
		System.out.println("------- 게시글목록 출력 종료 --------\n\n");			
	}

	private void findBySubject(BoardDAOImpl bddao) {
		String subject = JOptionPane.showInputDialog("검색할 글제목을 입력하세요!!");				
		ArrayList<BoardVO> boards = bddao.findBySubjectBoard(subject);
		// select * from board where subject like '%게시%';
		// listBoard와 유사한 로직
		// subject가 null or 공란인지 체크
		
		System.out.println("================================");
		System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
		System.out.println("================================");
		
		for(BoardVO board:boards) {
			System.out.println(board.toString());
		}
		System.out.println("------- 게시글목록 출력 종료 --------\n\n");		
	}

	private void deleteBoard(BoardDAOImpl bddao) {
		String bno = JOptionPane.showInputDialog("삭제할 글번호를 입력하세요!!");		
		
		if((bno == null) || (bno.equals(""))) {
			return;
		} else {
			bddao.deleteBoard(Integer.parseInt(bno));
		}		
	}

	private void updateBoard(BoardDAOImpl bddao) {
		String bno = JOptionPane.showInputDialog("수정할 글번호를 입력하세요!!");		
		
		if((bno == null) || (bno.equals(""))) {
			return;
		} else {
			bddao.updateBoard(Integer.parseInt(bno));
		}			
	}

	private void contentView(BoardDAOImpl bddao) {
		String bno = JOptionPane.showInputDialog("조회할 글번호를 입력하세요!!");	
		
		if((bno == null) || (bno.equals(""))) {
			return;
		} else {
			BoardVO board = bddao.viewBoard(Integer.parseInt(bno));	
			System.out.println("글제목 : " + board.getSubject());
			System.out.println("작성자 : " + board.getWriter());
			System.out.println("글내용 : " + board.getContent());
		}	
	}

	private void listBoard(BoardDAOImpl bddao) {
		ArrayList<BoardVO> boards = bddao.listBoard();	
		System.out.println("================================");
		System.out.println("글번호\t\t제목\t\t작성자\t\t내용");
		System.out.println("================================");
		
		for(BoardVO board:boards) {
			System.out.println(board.toString());
		}
		System.out.println("------- 게시글목록 출력 종료 --------\n\n");
	}

	private void makeBoard(BoardDAOImpl bddao) {
		bddao.createBoard();		
	}

	private int mainMenuUi() {
		String menuNo = JOptionPane.showInputDialog(
			"===== 게시판관리프로그램 V1.0 =====\n\n" +
			"1. 새로운 글쓰기\n" + 
			"2. 전체글 목록 조회\n" + 
			"3. 본문글 보기\n" + 
			"4. 본문글 수정\n" + 
			"5. 본문글 삭제\n" + 
			"6. 제목으로 게시글 조회\n" + 
			"7. 작성자로 게시글 조회\n" + 
			"0. 종료\n\n" + 
			"처리할 작업번호를 입력하세요"
		);
		if((menuNo == null) || (menuNo.equals(""))) {
			return 0;
		} else {
			return Integer.parseInt(menuNo);			
		}
	}
}




















