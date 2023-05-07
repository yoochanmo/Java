package com.lec.ex02_objects;

import java.util.Comparator;
import java.util.Objects;

/*
 	Objects 클래스
 	
 	Objects 클래스와 유사한 이름을 가진 java.util.Object클래스는 객체의 비교, 해시코드생성,
 	null여부, 객체문자열의 리터널등의 연산을 수행하는 static메서드로 구성된 Object의 유틸리티 클래스이다.
 	
 	1 . 객체비교(compare(T a, T b, Comparator<T> c))
 	
 		Object.compare() 메서드는 2 개의 객체를 비교해서 int값(-1, 0, 1)을 리턴한다.
 		java.util.Compare<T>는 제네릭 인터페이스 타입으로 두 객체를 비교하는 compare(a, b)
 		메서드가 정의되어 있다. 
 	
 	2 . 동등비교(equals(), deepEquals())
 	
 		Objects.equals(Object a, Object b) 메서드는 2 개 객체의 동등비교를 하는데
 		
 		1) a와 b가 모두 null일 경우 true
 		2) a와 b가 모두 not null일 경우 a.equals(b)의 결과를 리턴
 		
 		Objects.deepEquals(Object a, Object b)메서드 역시 2 개 객체의 동등을 비교하는데
 		
 		1) a 와 b가 서로 다른 배열일 경우, 항목의 값이 모두 같다면 true를 리턴
 		2) 이 메서드는 Arrays.deepEquals(Object[] a, Object[] b)와 동일한다.
 		
 	3 . 해시코드(hash(), hashCode())
 	
 		Objects.hash(Object..value) 메서드는 주어진 값들을 이용해서 해시코드를 생성하는 기능을
 		하는데 주어진 매개값들로 배열을 생성하고 Arrays.hashCode(Object[] a)를 호출해서
 		해시코드를 얻고 이 값을 리턴한다.
 		
 		이 메서드는 클래스가 hashCode()를 재정의할 때 리턴값을 생성하기 위해 사용하면 좋다.
 		클래스가 여러가지 필드를 가지고 있을 때 이 필드들로 부터 해시코드를 생성하게 되면
 		동일한 필드값 가지는 객체는 동일한 해시코드를 얻을 수가 있다.
 */
public class CompareMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println("비교굘과 = " + result);
		System.out.println("비교굘과 = " + Objects.compare(s1, s3, new StudentComparator()));
		System.out.println("비교굘과 = " + Objects.compare(s3, s1, new StudentComparator()));
		
		
	}

	static class Student{
		int sno;
		public Student(int sno) {
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student>{

		@Override
		public int compare(Student a, Student b) {
//			if(a.sno < b.sno) {
//				return -1;
//			}else if(a.sno == b.sno) {
//				return 0;
//			}else {
//				return 1;
//			}
			
		return Integer.compare(a.sno, b.sno);
		}
		
	}
	
	
	
}
