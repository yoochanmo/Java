package com.lec.exercise.answer.Exercise7_2;


class SutdaDeck {

	final int CARD_NUM = 20;

	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {

		/* 문제 7-1의 답이므로 내용생략 */
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}

	}

	/* (1) 위에 정의된 세 개의 메서드를 작성하시오 . */
	void shuffle() {

		int idx = 0;

		SutdaCard tmp;

		for (int i = 0; i < CARD_NUM; i++) {

			idx = (int) Math.random() % CARD_NUM;

			tmp = cards[idx];

			cards[idx] = cards[i];

			cards[i] = tmp;

		}

	}

	public SutdaCard pick(int index) {

		if (index < 0 || index >= CARD_NUM)

			return null;

		return cards[index];

	}

	SutdaCard pick() {

		int idx = (int) Math.random() % CARD_NUM;

		return cards[idx];

	}

} // SutdaDeck

class SutdaCard {

	int num;

	boolean isKwang;

	SutdaCard() {

		this(1, true);

	}

	SutdaCard(int num, boolean isKwang) {

		this.num = num;

		this.isKwang = isKwang;

	}

	public String toString() {

		return num + (isKwang ? "K" : "");

	}

}

class Exercise7_2 {

	public static void main(String args[]) {

		SutdaDeck deck = new SutdaDeck();

		System.out.println(deck.pick(0));

		System.out.println(deck.pick());

		deck.shuffle();

		for (int i = 0; i < deck.cards.length; i++)

			System.out.print(deck.cards[i] + ",");

		System.out.println();

		System.out.println(deck.pick(0));

	}

}