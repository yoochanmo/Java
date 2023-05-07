package com.lec.ex03_system;

import java.util.*;


/*
 	System 클래스
  
 	5 . 시스템프로퍼티읽기(gerProperty(), getProperties())
 	
 		시스템프로퍼티는 JVM이 시작될 때 자동으로 설정되는 시스템의 속성값들을 말한다.
 		예를 들어 운영체제의 종료, 자바프로그램을 실행시킨 사용자ID, JVM버전, 운영체제
 		에서 사용되는 파일경로, 구분자 등이다.
 		시스템프로퍼티는 key와 value으로 구성되어 있다.
 */

public class GetPropertyMain {

	public static void main(String[] args) {

		String os_name = System.getProperty("os.name");
		String user_name = System.getProperty("user.name");
		String user_home = System.getProperty("user.home");
		
		System.out.println("운영체제의 이름 = " + os_name);
		System.out.println("사용자의 이름 = " + user_name);
		System.out.println("사용자의 홈디렉토리 = " + user_home);
		System.out.println();
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("	[key]                           [Value]");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
		
		Properties props =  System.getProperties();
		Set keys =  props.keySet();
		for(Object key:keys) {
			String keyVal = (String) key;
			String value = System.getProperty(keyVal);
			System.out.println(" [ " + keyVal + " ] " + value);
		}
		
	}

}
