package com.lec.ex02_board;

public class BoardFactory {

	// 외부에서 생성금지
	private BoardFactory() {}
	private static BoardDAOImpl dbdao = null;
	public static BoardDAOImpl getInstance() {
		if(dbdao == null) dbdao = new BoardDAOImpl();
		return dbdao;
	}
}
