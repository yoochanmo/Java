package com.lec.ex11_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMain4 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90,Student.Gender.MALE,Student.City.SEOUL ),
				new Student("홍길순", 88,Student.Gender.FEMALE,Student.City.BUSAN),
				new Student("홍길녀", 89,Student.Gender.FEMALE,Student.City.SEOUL),
				new Student("홍길상", 91,Student.Gender.MALE,Student.City.BUSAN));
		
		// 1 . 성별로 평균점수구하기 (1) - reducing 과정
		Stream<Student> stream_1 = list.stream();						 				// 1) stream 생성
		Function<Student, Student.Gender> stream_2 = Student::getGender; 				// 2) 성별로 분류
		ToDoubleFunction<Student> stream_3 = Student::getScore; 		 				// 3) mapping 처리
		Collector<Student, ?, Double> stream_4 = Collectors.averagingDouble(stream_3);	// 4) 평균	
		Collector<Student, ?, Map<Student.Gender, Double>> stream_5 = Collectors.groupingBy(stream_2, stream_4); // 5) 그룹핑 & 평균
		Map<Student.Gender, Double>by_gender = stream_1.collect(stream_5); // 6) 결과
		System.out.println("남학생평균 = " + by_gender.get(Student.Gender.MALE));
		System.out.println("여학생평균 = " + by_gender.get(Student.Gender.FEMALE));
		System.out.println();
		
		// 2 . 성별로 평균점수구하기 (2) - reducing 요약
		Map<Student.Gender, Double> by_gender1 = list.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingDouble(Student::getScore)));
		System.out.println("남학생평균 = " + by_gender1.get(Student.Gender.MALE));
		System.out.println("여학생평균 = " + by_gender1.get(Student.Gender.FEMALE));
		System.out.println();
		
		// 3 . 성별로 그룹핑해서 학생이름을 특정문자(컴마)로 join하기
		Map<Student.Gender, String> by_gender2 = list.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.mapping(Student::getName,Collectors.joining(","))));
		System.out.println("남학생 전체 = " + by_gender2.get(Student.Gender.MALE));
		System.out.println("여학생 전체 = " + by_gender2.get(Student.Gender.FEMALE));
	}

}
