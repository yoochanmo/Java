package com.lec.exercise.exam.Exercise14_6;

import java.util.Comparator;
import java.util.stream.Stream;

public class Exercise14_6 {

	public static void main(String[] args) {
		String[] strArr = {"aaa","bb","c","dddd"};
		Stream<String> strStream = Stream.of(strArr);
		
		strStream.map(String::length)
		.sorted(Comparator.reverseOrder())
		.limit(1).forEach(System.out::println);

	}

}
