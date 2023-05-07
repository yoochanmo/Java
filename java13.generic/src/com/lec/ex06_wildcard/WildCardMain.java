package com.lec.ex06_wildcard;

import java.util.Arrays;

/*
 	와일드카드(<?>, < ? extends 상위타입>, <? super 하위타입>)
 	
 	프로그램에서 ?을 일반적으로 와일드카드라고 한다. 제네릭타입을 매개값이나 리턴타입으로
 	사용할 때 구체적인 타입대신에 와일드 카드를 사용할 수 있다. 와일드카드를 사용하는 형태는
 	다음과 같이 3가지 형태로 사용할 수 있다.
 	
 	1 . <?>						: 타입의 제한이 없다.
 	2 . <? extends 상위타입>    : 하위타입만 가능하다. 즉, 상위타입이상은 제한
 	3 . <? super 하위타입>		: 하위타입포함 상위타입만 가능하다. 즉 하위타입이하는 제한
 */
public class WildCardMain {

	public static void main(String[] args) {
		
		// 1 . 일반인코스 :  모두 수강등록이 가능한 코스
		Course<Person> 일반인코스 = new Course<>("일반인", 5);
		일반인코스.add(new Person("일반인A"));
		일반인코스.add(new Worker("직장인A"));
		일반인코스.add(new Student("학생A"));
		일반인코스.add(new HighStudent("ㅈ고딩"));
		
		// 2 . 학생코스	  :  학생만 수강등록이 가능한 코스
		Course<Student> 학생코스 = new Course<>("학생코스", 10);
		//학생코스.add(new Person("일반인A"));
		//학생코스.add(new Worker("직장인A"));
		학생코스.add(new Student("학생A"));
		학생코스.add(new HighStudent("ㅈ고딩"));
		
		// 3 . 직장인반   :  직장인만 수강등록이 가능한 코스
		Course<Worker> 직장인코스 = new Course<>("직장인코스", 5);
		//직장인코스.add(new Person("일반인A"));
		직장인코스.add(new Worker("직장인A"));
		//직장인코스.add(new Student("학생A"));
		//직장인코스.add(new HighStudent("ㅈ고딩"));
		
		
		// 메서드
		// A . 일반인
		System.out.println("------일반인과정------");
		일반인(일반인코스);
		일반인(학생코스);
		일반인(직장인코스);
		System.out.println();
		// B . 학생
		System.out.println("------학생과정------");
		//학생(일반인코스);
		학생(학생코스);
		//학생(직장인코스);
		System.out.println();
		// C . 직장인
		System.out.println("------직장인과정------");
		직장인(일반인코스);
		//직장인(학생코스);
		직장인(직장인코스);
		System.out.println();
	}
	
	// 수강등록하기
	// 1 . 일반인
	public static void 일반인(Course<?> course) {
		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	// 2 . 학생반
	public static void 학생(Course<? extends Student> course) {
	System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}
	
	// 3 . 직장인
	public static void 직장인(Course<? super Worker> course) {
	System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
	}

}
