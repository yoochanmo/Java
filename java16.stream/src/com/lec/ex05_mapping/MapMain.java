package com.lec.ex05_mapping;

import java.util.Arrays;
import java.util.List;

public class MapMain {

	public static void main(String[] args) {
		// 1 . map : 특정의 요소를 전달 받아서 다른 형태의 stream으로 리턴
		List<Student> list = Arrays.asList(
					new Student("홍길순",90),
					new Student("홍길동",80),
					new Student("홍길자",85)
				);

		list.stream().mapToInt(Student::getScore).forEach(System.out::println);
		int sum = list.stream().mapToInt(Student::getScore).sum();
		System.out.println("학생들의 총점 = " + sum);
	}

}

class Student{
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
