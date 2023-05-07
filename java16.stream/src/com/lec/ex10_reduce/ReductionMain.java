package com.lec.ex10_reduce;

import java.util.Arrays;
import java.util.List;

public class ReductionMain {

	public static void main(String[] args) {
		
		
		// map -> reduce -> MapAndReduce
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("홍길순", 98),
				new Student("홍길자", 95)
				);
		
		// 1 . 합계구하기(1) - sum()
		int sum = list.stream().mapToInt(Student::getScore).sum();
		System.out.println("합계구하기(1) - sum() = " + sum);
		
		// 2 . 합계구하기(2) - reduce(BinaryOperator), 예외처리를 하지 않음
		//  reduce의 리턴타입은 OptionalInt
		sum = list.stream().mapToInt(Student::getScore).reduce((a,b) -> a+b).getAsInt();
		System.out.println("합계구하기(2) - reduce() = " + sum);
		
		// 3 . 합계구하기(3) - reduce(int, BinaryOperator), 예외처리를 하지 않음
		sum = list.stream().mapToInt(Student::getScore).reduce(0, (a,b) -> a+b);
		System.out.println("합계구하기(3) - reduce() = " + sum);
		
	}

}

class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	
}