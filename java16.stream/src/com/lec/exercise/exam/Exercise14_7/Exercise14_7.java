package com.lec.exercise.exam.Exercise14_7;

import java.util.Random;

public class Exercise14_7 {

	public static void main(String[] args) {
		new Random().ints(1,45).distinct().limit(6).sorted().forEach(System.out::println);

	}

}
