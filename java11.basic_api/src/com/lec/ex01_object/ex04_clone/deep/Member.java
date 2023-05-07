package com.lec.ex01_object.ex04_clone.deep;

import java.util.Arrays;

public class Member implements Cloneable{

	public String name;
	public int age;
	public int[] scores;
	public Car car;
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cloned;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 1 . 먼저 얕은 복제 : name, age, scores, car
		Member cloned = (Member) super.clone(); // Object.clone() 즉, 얕은 복제
		
		// 2 . 참조타입을 깊은 복제 : scores, car
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}
}




class Car{
	public String model;
	
	public Car(String model) {
		this.model = model;
	}
}
