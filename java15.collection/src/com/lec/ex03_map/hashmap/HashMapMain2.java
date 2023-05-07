package com.lec.ex03_map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HashMapMain2 {

	public static void main(String[] args) {
	
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "소향"), 80);
		map.put(new Student(1, "소향"), 99);
		System.out.println("총 객체 수 = " + map.size());
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> students = keySet.iterator();
		while(students.hasNext()) {
			Student student = students.next();
			Integer score = map.get(student);
			System.out.println(student.toString() + "의 점수 = " + score);
		}
	}
}

class Student {
	
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return this.sno + this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (this.sno == student.sno) && (this.name.equals(student.name));
		}
		return false;
	}
	
	
}