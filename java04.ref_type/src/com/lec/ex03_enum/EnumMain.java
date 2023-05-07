package com.lec.ex03_enum;

import java.util.Calendar;

public class EnumMain {

	public static void main(String[] args) {
		
		String str = new String ("소향");
		// Week today = new week(); enum은 객체를 생성할 수 없다.(객체화, 인스턴스화를 할 수 없다.)
		// Week 열거타입을 선언했다면 열거타입을 호출해서 사용할 수 있다.
		// 열거타입은 하나의 데이터타입(참조타입,사용자가 정의한 새로운 데이터타입)이므로 변수로
		// 선언하고 사용해야한다. 열거타입변수를 선언했다면 열거상수를 저장하거나 사용할 수 있다.
		// 열거상수는 단독으로 사용할 수 없고 "열거타입.열거상수"형태로 사용해야 한다.
		// 즉, Week.MONDAY의 형태로 사용해야 한다.
		Week today = null;
		System.out.println(today.Monday);
		
		// 현재의 요일을 확인하기
		// Calendar를 이용하여 날짜를 제어할 수 있다... Calendar는 String이나 System처럼 기본클래스이다.
		Calendar cal = Calendar.getInstance(); // new연산자를 사용하지 않고 getInstance()메서드로 객체화한다.
		System.out.println(cal.toString());
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 데이오브위크는 현재 요일을 int로 리턴
		// 1 = 일 , ... 7 = 토
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1 : today = Week.SUNDAY; break;
		case 2 : today = Week.Monday; break;
		case 3 : today = Week.화요일; break;
		case 4 : today = Week.WENDSDAY; break;
		case 5 : today = Week.THURDAY; break;
		case 6 : today = Week.FRIDAY; break;
		case 7 : today = Week.SATURDAY; break;
		}
		System.out.println("오늘의 요일은 " + today + "입니다");
		
		// 사원테이블에서 주민번호 7번째로 남,여를 구분
		int gender = 1; // 예를 들어 7번째 값을 가져왔다.
		if(gender==1 || gender==3) {
			System.out.println(" 이 사원은 " + Gender.남자 + "입니다.");
		}
	}

}
