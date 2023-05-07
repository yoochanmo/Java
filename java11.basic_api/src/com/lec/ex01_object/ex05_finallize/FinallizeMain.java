package com.lec.ex01_object.ex05_finallize;

public class FinallizeMain {

	public static void main(String[] args) {
		
		Counter counter = null;
		
		for(int i = 0; i <= 50; i++) {
			counter = new Counter(i);
			counter = null; // 생성된 객체를 더 이상 참조하지 않음 즉, 쓰레기 객체
			System.gc();    // Garbage Collector에게 사용하지 않는 객체를 힙영역에서 삭제를 요청
		}
		

	}

}
