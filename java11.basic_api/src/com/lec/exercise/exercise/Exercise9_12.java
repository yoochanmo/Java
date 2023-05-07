package com.lec.exercise.exercise;

public class Exercise9_12 {

	/* (1) getRand 메서드를 작성하시오 . */
	public static int getRand(int from, int to) {
		return (int)(Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);
	}
	

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++)

			System.out.print(getRand(1, -3) + ",");

	}

}