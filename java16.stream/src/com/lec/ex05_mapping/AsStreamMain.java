package com.lec.ex05_mapping;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsStreamMain {

	public static void main(String[] args) {
		
		int[]int_array = {1,2,3,4,5};
		
		// 1 . asDoubleStream : int, long타입의 값을 double로 변환
		IntStream int_stream = Arrays.stream(int_array);
		int_stream.asDoubleStream().forEach(System.out::println);
		System.out.println();
		
		// 2 . boxed()        : int -> Integer, long -> Long, double -> Double로 박싱후 리턴
		int_stream = Arrays.stream(int_array);
		int_stream.boxed().forEach(obj -> System.out.println(obj.intValue()));
		System.out.println();
		
		int_stream = Arrays.stream(int_array);
		int_stream.boxed().forEach(obj -> System.out.println(obj.getClass()));
	}

}
