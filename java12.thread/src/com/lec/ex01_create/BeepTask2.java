package com.lec.ex01_create;

import java.awt.Toolkit;

public class BeepTask2 extends Thread{
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 스피커자원
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
				System.out.println("띵소리");
			} catch (InterruptedException e) {
					e.printStackTrace();
			} // 0.5초간 정지
		}
		super.run();
	}

}
