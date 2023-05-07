package com.lec.ex02_try_catch;

public class TryCatchMain {

	public static void main(String[] args) {
		
		// 1 . 일반예외
		// Class.forName()메서드는 해당클래스를 객체로 반환해주는 기능
		// 즉, new 객체생성연산자와 동일한 기능을 한다.
		try {
			Class _class = Class.forName("java.lang.Stringxxxxx");
			System.out.println("클래스를 찾았습니다...");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못했습니다.");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

			System.out.println("증말 중요한 로직을 처리합ㄴ ㅣ  ㄷ ㅏ .....");
	}

}
