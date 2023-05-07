package com.lec.ex02_objects;

import java.util.Objects;

/*
	Objects 클래스
	
	2 . 동등비교(equals(), deepEquals())
	
		Objects.equals(Object a, Object b) 메서드는 2 개 객체의 동등비교를 하는데
		
		1) a와 b가 모두 null일 경우 true
		2) a와 b가 모두 not null일 경우 a.equals(b)의 결과를 리턴
		
		Objects.deepEquals(Object a, Object b)메서드 역시 2 개 객체의 동등을 비교하는데
		
		1) a 와 b가 서로 다른 배열일 경우, 항목의 값이 모두 같다면 true를 리턴
		2) 이 메서드는 Arrays.deepEquals(Object[] a, Object[] b)와 동일한다.
		

*/
public class EqualsAndDeepEqualsMain {

	public static void main(String[] args) {
		
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2)); // true
		System.out.println(Objects.equals(o1, null)); // false
		System.out.println(Objects.equals(null, o2)); // false
		System.out.println(Objects.deepEquals(o1, o2)); // true
		System.out.println(Objects.equals(o1, o2)); // true
		System.out.println(Objects.equals(null, null)); // true
		System.out.println();
		
		Integer[] a1 = {1,2,3};
		Integer[] a2 = {1,2,3};
		System.out.println(Objects.equals(a1, a2)); // false
		System.out.println(Objects.deepEquals(a1, a2)); // 값까지 비교하기 때문에 true
		System.out.println(Objects.deepEquals(a1, null)); // false
		System.out.println(Objects.deepEquals(null, a2)); // false
		System.out.println(Objects.deepEquals(null, null)); // true
	}

}






























