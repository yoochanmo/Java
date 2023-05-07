package com.lec.ex06_lifo_fifo;

import java.util.Stack;

/*
 	LIFO와(후입선출) FIFO(선입선출) 컬렉션
 	
 	후입선출(LIFO, Last In First Out)은 나중에 저장된 객체를 먼저 꺼내오는 자료구조이고 반대로
 	선입선출(FIFO, First In First Out)은 먼저 저장된 객체가 먼저 꺼내지는 자료구조를 말한다.
 	
 	컬렉션프레임워크에는 LIFO자료구조를 지원하는 Stack클래스와 FIFO자료구조를 자원하는 Queue 인터페이스를 지원한다.
 	
 	1 . Stack class
 		
 		Stack클래스는 LIFO자료구조를 구현한 클래스이다. 주요 메서드는
 		
 		1 ) push(E item) : 주어진 객체를 stack에 저장
 		2 ) peek()		 : stack의 맨위(맨 나중에 저장된) 객체를 꺼내만 온다.
 		3 ) pop()		 : stack의 맨위(맨 나중에 저장된) 객체를 꺼내온 후 삭제.
 		
 	
 	2 . Queue Interface
 	
 		Queue 인터페이스는 FIFO자료구조를 구현한 LinkedList이고 주요 메서드는
 		
 		1 ) offer(E item) : 주어진 객체를 interface에 저장
 		2 ) peek()		  : 맨 처음에 저장된 객체를 꺼내만 온다.
 		3 ) poll()		  : 맨 처음에 저자오딘 객체를 꺼내온 후 삭제.
 */
public class StackMain {

	public static void main(String[] args) {
		
		Stack<Coin> coin_box = new Stack<>();
		
		coin_box.push(new Coin(50));
		coin_box.push(new Coin(100));
		coin_box.push(new Coin(10));
		coin_box.push(new Coin(1));
		coin_box.push(new Coin(500));
		
		while(!coin_box.isEmpty()) {
			Coin coin = coin_box.pop();
			System.out.println("꺼내온 동전은 " + coin.getValue() + "원 입니다. ");
		}
		System.out.println("프로그램종료");
	}

}

class Coin {
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
