package com.lec.exercise.exam.Exercise14_4;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_4 {

	public static void main(String[] args) {
		Stream<Integer> dice = IntStream.rangeClosed(1, 6).boxed();
		
		dice.flatMap(i -> Stream.of(1,2,3,4,5,6).map(i2 -> new int[] {i, i2}))
		.filter(iArr -> iArr[0] + iArr[1] ==6).forEach(iArr -> System.out.println(Arrays.toString(iArr)));

	}

}
