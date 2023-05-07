package com.lec.ex04_tree.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetMain2 {

	public static void main(String[] args) {
		// 2 . TreeSet 정렬하기

		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 1) 자동정렬하기 - TreeSet은 저장될 때 자동으로 오름차순으로 정렬되어 저장한다.
		System.out.print("오름차순 : ");
		for(Integer score:scores) {
			System.out.print(score + ", ");
		}
		System.out.println();
		
		// 2 ) 내림차순, 오름차순 정렬하기
		// descendingSet()		: 내림차순, NavigablaSet객체로 리턴
		// descendingIterator() : 내림차순, Iterator 객체로 리턴
		System.out.print("내림차순 : ");
		NavigableSet<Integer> descSet = scores.descendingSet();
		for(Integer score:descSet) {
			System.out.print(score + ", ");
		}
		System.out.println();
		
		// 내림차순 -> 오름차순
		System.out.print("내림 -> 오름차순 : ");
		NavigableSet<Integer> ascSet = descSet.descendingSet();
		for(Integer score:ascSet) {
			System.out.print(score + ", ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
