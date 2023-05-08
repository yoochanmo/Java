package com.lec.ex02_board;

import java.util.ArrayList;
import java.util.List;

public interface BoardDAOService {

	void createBoard(); // 1 . 글쓰기
	ArrayList<BoardVo> listBoard(); // 2 . 글목록
	BoardVo viewBoard(int bno); // 3 . 글조회
	void updateBoard(int bno, String subject, String writer, String content); // 4 . 글수정
	void deleteBoard(int bno); // 5 . 글삭제
	
	ArrayList<BoardVo> findBySubjectBoard(String subject); // 6 . 글검색 by 제목
	ArrayList<BoardVo> findBywriterBoard(String writer); // 7 . 글작성 by 작성자
}
