package com.lec.ex10_constructor;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean hong = new Korean("홍길동", "951118-1247852");
		System.out.println(hong.toString());
		System.out.println(hong.result);
		System.out.println(hong.add(2000, 5000)); 
		// 필드의 속성이 변경하는 것이 아니라 메서드만 호출한 것이다.
		// hong객체의 result속성은 변경되지 않는다.
		System.out.println(hong.result);
		
	}

}
