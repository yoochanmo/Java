package com.lec.ex04_while;

import javax.swing.JOptionPane;

public class SwingMain {

	public static void main(String[] args) {
		// 숫자 맞추기 게임
		// Java에서 Swing은 GUI환경으로 인터페이스를 만들어 준다.
		String data = JOptionPane.showInputDialog("0부터 100까지 숫자를 입력하세요");
		//System.out.println("입력된 값 = " + data);
		
		int answer = 77;
		int inputNumber = 0;
		inputNumber = Integer.parseInt(data);
		
		if(inputNumber == answer) {
			System.out.print("축하해 정답이야");
		} else {
			System.out.println("정답이 아닌데? ㅋㅋ");
		}
		
		System.out.println(JOptionPane.showConfirmDialog(null, data)); // Y= 0, NO = 1 , Cancel = 2
		
	}

}
