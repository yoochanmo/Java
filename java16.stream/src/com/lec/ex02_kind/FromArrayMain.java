package com.lec.ex02_kind;

import java.util.Arrays;
import java.util.stream.*;


public class FromArrayMain {

	public static void main(String[] args) {
		// 2 . Arrays로부터 Stream을 얻기
		String[] names = {"홍길동","홍길순","홍길자"};
		
		Stream<String> stream = Arrays.stream(names);
		stream.forEach(System.out :: println);
		System.out.println();
		
		stream = Arrays.stream(names);
		stream.forEach(n -> System.out.println(n));
		System.out.println();
				
		int[]nums = {1,2,3,4,5,6,7,8,9,10};
		IntStream is = Arrays.stream(nums);
		is.forEach(System.out :: print);
		System.out.println();
		is = Arrays.stream(nums);
		is.forEach(i -> System.out.print(i + ", "));
		System.out.println();
		
		double[]d_nums = {1,2,3,4,5,6,7,8,9,10};
		DoubleStream ds = Arrays.stream(d_nums);
		ds.forEach(d -> System.out.print(d + ", "));
		System.out.println();
		
		long[]l_nums = {1,2,3,4,5,6,7,8,9,10};
		LongStream ls = Arrays.stream(l_nums);
		ls.forEach(l -> System.out.print(l + ", "));
		System.out.println();
		
	}

}
