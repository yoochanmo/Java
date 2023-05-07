package com.lec.exercise.Exercise11_6;

import java.util.*;

public class Exercise11_6 {

	static int getGroupCount(TreeSet<Student> tset, int from, int to) {
		Student s1 = new Student("from", 0, 0, from, from, from);
		Student s2 = new Student("to", 0, 0, to, to, to);

		return (tset.subSet(s1, s2)).size();
	}

	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {

			public int compare(Student s1, Student s2) {
				if (s1.getAverage() > s2.getAverage())
					return 1;
				else
					return -1;
			}

		});

		set.add(new Student("홍길동", 1, 1, 100, 100, 100));
		set.add(new Student("남궁성", 1, 2, 90, 70, 80));
		set.add(new Student("김자바", 1, 3, 80, 80, 90));
		set.add(new Student("이자바", 1, 4, 70, 90, 70));

		Iterator<Student> it = set.iterator();

		while (it.hasNext())
			System.out.println(it.next());

		System.out.println("[60~69]:" + getGroupCount(set, 60, 69));
		System.out.println("[70~79]:" + getGroupCount(set, 70, 79));
		System.out.println("[80~89]:" + getGroupCount(set, 80, 89));
		System.out.println("[90~100]:" + getGroupCount(set, 90, 100));

	}

}

class Student implements Comparable<Student> {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return Math.round((getTotal() / 3f) * 10) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math
				+ "," + getTotal() + ",평균점수:" + getAverage();
	}

public int compareTo(Student o) {
		return name.compareTo(o.name);
}
}