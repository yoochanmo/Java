package com.lec.exercise.exercise;

public class Exercise12_5 {

	public static void main(String[] args) {
		Deck d = new Deck(); // 카드 한 벌(Deck)을 만든다.

		Card c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑는다.

		System.out.println(c); // System.out.println(c.toString());과 같다.

		d.shuffle(); // 카드를 섞는다.

		c = d.pick(0); // 섞은 후에 제일 위의 카드를 뽑는다 .

		System.out.println(c);

	}

}

class Deck {

	final int CARD_NUM = Card.Kind.values().length * Card.Number.values().length;// 카드의 개수

	Card cardArr[] = new Card[CARD_NUM]; // Card객체 배열을 포함

	Deck() {

		/*
		 * 
		 * (1) 알맞은 코드를 넣어서 완성하시오.
		 * 
		 * Deck의 카드를 초기화한다 .
		 * 
		 */
		
		int i = 0;
		
		for(Card.Kind kind : Card.Kind.values()) {
			for(Card.Number num : Card.Number.values()) {
				cardArr[i++] = new Card(kind,num);
			}
		}

	}

	Card pick(int index){  // 지정된위치에 있는 카드 하나를 꺼내서 반환(index)
		 return cardArr[index];
		 }

	Card pick() { // Deck에서 카드 하나를 선택한다.

		int index = (int) (Math.random() * CARD_NUM);

		return pick(index);

	}

	void shuffle() { // 카드의 순서를 섞는다.

		for (int i = 0; i < cardArr.length; i++) {

			int r = (int) (Math.random() * CARD_NUM);

			Card temp = cardArr[i];
			
			cardArr[i] = cardArr[r];
			
			cardArr[r] = temp;
			
		}
		
	}
		}


//Card 클래스 

class Card {

	enum Kind {
		CLOVER, HEART, DIAMOND, SPADE
	}

	enum Number {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}

	Kind kind;

	Number num;

	Card() {

		this(Kind.SPADE, Number.ACE);

	}

	Card(Kind kind, Number num) {

		this.kind = kind;

		this.num = num;

	}

	public String toString() {

		return "[" + kind.name() + "," + num.name() + "]";

	}

}
