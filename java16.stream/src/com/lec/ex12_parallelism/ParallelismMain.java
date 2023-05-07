package com.lec.ex12_parallelism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
	병렬처리
	
	병렬처리(Parallel Operation)란 멀티코어 CPU환경에서 하나의 작업을 분할해서 각각의 코어가
	병렬적으로 처리하는 것을 말한다. 병렬처리의 목적은 작업시간을 줄이기 위한 것이다.
	Java8버전부터 요소를 병렬처리할 수 있도록 하기 위해서 병렬처리스트림을 제공하기 때문에
	컬렉션, 배열의 전체요소를 처리하는 시간을 줄여 준다.
	
	동시성(Concurrency)과 병렬성(Parallelism)
	
	멀티쓰레드는 동시성 또는 병렬성으로 실행되기 때문에 이 둘이 멀티 쓰레드의 동작방식이라는 점
	에서는 동일하나 각각 다른 목적을 가지고 있다.
	
	동시성은 멀티작업을 위해 멀티쓰레드가 번갈아 가면서 실행하는 것을 말하고 병렬성은 멀티작업을
	위해 멀티코어를 이용해서 동시에 실행하는 것을 말한다.
*/
public class ParallelismMain {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
				new Student("홍길동", 90, Student.Gender.MALE, Student.City.SEOUL),
				new Student("홍길순", 88, Student.Gender.FEMALE, Student.City.PUSAN),
				new Student("홍길녀", 89, Student.Gender.FEMALE, Student.City.SEOUL),
				new Student("홍길상", 91, Student.Gender.MALE, Student.City.PUSAN));

		MaleStudent 남학생 = list.parallelStream()
								 .filter(s -> s.getGender() == Student.Gender.MALE)
								 .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);
		남학생.getList().stream().forEach(s -> System.out.print(s.getName() + ", "));
	}

}

class Student {
	
	public enum Gender {MALE, FEMALE};
	public enum City {SEOUL, PUSAN};
	
	private String name;
	private int score;
	private Gender gender;
	private City city;
	
	public Student(String name, int score, Gender gender) {
		this.name = name;
		this.score = score;
		this.gender = gender;
	}

	public Student(String name, int score, Gender gender, City city) {
		this.name = name;
		this.score = score;
		this.gender = gender;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Gender getGender() {
		return gender;
	}

	public City getCity() {
		return city;
	}
}

class MaleStudent {
	
	// 남학생들만 저장할 컨테이너
	private List<Student> list;  // 남학생들의 요소만 저장할 컬렉션
	
	public MaleStudent() {
		this.list = new ArrayList<Student>();
		System.out.println("[" + Thread.currentThread().getName() + "] 생성자를 호출한 쓰레드");
	}
	
	// 요소들을 저장할 메서드
	public void accumulate(Student student) {
		this.list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate() 호출한 쓰레드");		
	}
	
	// 두 MaleStudent를 결합하는 메서드(병렬처리시에만 처리)
	public void combine(MaleStudent other) {
		this.list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine() 호출한 쓰레드");		
	}

	public List<Student> getList() {
		return this.list;
	}
}