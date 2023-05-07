package com.lec.ex05_compare;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorMain {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>(new StudentComparator());
		ts.add(new Student("홍길동", 1000));
		ts.add(new Student("손흥민", 31));
		ts.add(new Student("이강인", 22));
		ts.add(new Student("김민재", 25));
		ts.add(new Student("소향", 10));
		ts.add(new Student("나얼", 40));
		ts.add(new Student("거미", 42));
		ts.add(new Student("거미", 10));
		System.out.println("총 객체수 = " + ts.size());
		System.out.println();
		
		Iterator<Student> students = ts.iterator();
		while(students.hasNext()) {
			Student student = students.next();
			System.out.println(student.name + ", " + student.sno);
		}
	}

}

class Student{
	String name;
	int sno;
	
	public Student(String name, int sno) {
		this.name = name;
		this.sno = sno;
	}
	
	
}

class StudentComparator implements Comparator<Student>{

	// 1 . 이름순
//	@Override public int compare(Student s1, Student s2) {
//		return s1.name.compareTo(s2.name); 
//	
//	}
	
	// 2 . 학생번호순
	@Override public int compare(Student s1, Student s2) {
		return (s1.sno < s2.sno) ? -1 : ((s1.sno == s2.sno) ? 0 : -1);
	}
		
	// 3 . 학생번호와 이름순
//	@Override public int compare(Student s1, Student s2) {
//		int x = s1.name.hashCode() + s1.sno;
//		int y = s2.name.hashCode() + s2.sno;
//		return (x < y) ? -1 : ((x == y) ? 0 : 1);
//	}
	
}