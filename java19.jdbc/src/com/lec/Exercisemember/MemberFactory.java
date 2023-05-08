package com.lec.Exercisemember;

import com.lec.ex02_board.BoardDAOImpl;

public class MemberFactory {
	// 외부에서 생성금지
	private MemberFactory() {}
	private static MemberDAOImpl dbdao = null;
	public static MemberDAOImpl getInstance() {
		if(dbdao == null) dbdao = new MemberDAOImpl();
		return dbdao;
	}
}


