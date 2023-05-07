package com.lec.exercise.exam.Exercise14_5;

import java.util.stream.Stream;

public class Exercise14_5 {

	public static void main(String[] args) {
		String[] strArr = {"aaa","bb","c","dddd"};
		Stream<String> strStream = Stream.of(strArr);
		
		int sum = strStream.mapToInt(String::length).sum();
		System.out.println("sum = " + sum);

	}

}
