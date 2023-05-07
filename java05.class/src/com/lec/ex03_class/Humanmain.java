package com.lec.ex03_class;

public class Humanmain {

	public static void main(String[] args) {
		
		
		// 메서드오버로딩
		Human kor = new Human("손흥민");
		kor.speak();
		
		Human usa = new Human("미국");
		usa.speak("영어");

		Human chn = new Human("중국");
		usa.speak("광동어");
		
		kor.speak("한국어");
		
		kor.speak(30,"한국어");
		kor.speak("일본어",33);
	}

}
