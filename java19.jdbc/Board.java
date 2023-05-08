package com.lec.ex02_board;

import java.sql.Connection;

/*
	A. DAO와 DTO(VO) 개념
	
	1. DAO(Data Access Object)
	
	   DAO는 간단히 Database의 data에 접근을 하기 위한 객체로서 
	   DB에 접근을 하기 위한 로직과 비지니스(select, delete...)로직을
	   분리하는 개념이다.
	   
	   DAO는 DB에 접근해서 데이터를 조회하거나 조작하는 기능을 전담하
	   도록 만든 객체를 말한다. 사용자는 자신이 필요한 Interface를 
	   DAO에 전달하고 DAO는 이 인터페이스를 구현한 객체를 사용자가 편리
	   하게 사용할 수 있도록 변환해 준다.
	   
	   DB에 접근은 DAO가 전담하도록하고 데이터베이스 엑세스를 DAO에서만
	   하게 되면 다수의 원격호출을 통한 오버헤드를 DTO(VO)를 통해 줄일 수
	   있고 다수의 DB호출로 DB서버에 부담을 줄일 수 있게 한다.
	
	2. DTO(Data Transfer Object, VO Value Object)
	   
	   DTO는 데이터를 교환하는 즉, 데이터를 저장하는 그릇으로 이해하면 좋다.
	   일반적으로 DTO는 로직을 가지고 있지않고 데이터의 속성(필드)과 그
	   속성에 접근을 하기 위한 getter/setter메서드만 가진 클래스를 말한다.
	   
	   VO와 DTO는 동일한 개념이지만 VO는 일반적으로 read only속성을 가진다.
	   
	B. 게시판 Application
	
	1. BOARD 테이블생성
	
	   create table scott.board(
	   		bno			number			not null primary key 
	   	  , subject		varchar2(100)	not null
	   	  , writer		varchar2(50)	not null
	   	  , content 	varchar2(256)	
	   	  , crtdate		date			default sysdate
	   	  , readcnt	   	number  		default 0
	   );
	   
	   create sequence scott.board_bno_s;
	
	2. jdbc.properties 생성
	
	   1) DB접속정보
	   
	   2) sql정보
	
	3. board 프로그램
	
	   1) Board             : 게시판 메인 클래스
	   2) BoardVO           : 게시판 Model 클래스
	   3) ConnectionFactory : DB접속정보를 공통으로 사용하기 위한 클래스
	   4) BoardDAOService   : 게시판 Interface 클래스
	   5) BoardDAOImpl      : 게시판 구현 클래스
	   6) BoardFactory      : 게시글 생성 클래스(Singleton클래스)
	   7) BoardMenu         : 게시판 메인메뉴 클래스
	
*/
public class Board {

	public static void main(String[] args) throws Exception {
			
		BoardMenu menu = new BoardMenu(1.0);
		// menu.mainMenu();
		menu.mainBoardMenu();
	}

}












