package com.lec.ex04_while;

import java.io.IOException;

public class WhileKeyControlMain {

	public static void main(String[] args) throws IOException {
		// 외부에서 특정의 값을 입력받기 위해서는 여러가지 방법중에
		// System.in의 read() 메서드를 사용한다. 이 메서드는 키보드의
		// 입력을 대기하고 있다가 엔터기를 친 후에 키보드의 ASCII값을
		// 정수로 리턴한다. 
		// ReturnKey = 13, Enter = 10, A = 65, a = 97, 0 = 48
		//	System.out.println("키보드에서 문자를 입력하세요 =");
		//	int key = System.in.read();		
		//	System.out.println("입력된 키의 값(ASCII_) = " + key);
		
		// 리모컨 제어 프로그램 만들기
		// 1번키를 누르면 볼륨업, 2번키는 볼륨다운, 3번키는 음소거 & 중단
		
		boolean run = true;
		int keyCode = 0;
		int volumn = 0;
		
		while(run) {
			
			if(keyCode !=13 && keyCode != 10) {
				System.out.println("---------------------------------------");
				System.out.println("1 . 볼륨업 2. 볼륨다운 3 . 음소거 & 종료1");
				System.out.println("---------------------------------------");
			}
			keyCode = System.in.read();
			//System.out.println("입력된 키코드 값 = " + keyCode);1
			if(keyCode == 49) {
				volumn++;
				System.out.println("현재볼륨은 " + volumn);
			}else if(keyCode == 50){
				volumn--;
				System.out.println("횬재볼륨은 " + volumn );
			}else if(keyCode== 51) {
				run = false;
			}
			if(keyCode == 51) run = false;
		}
	}

}
