package com.lec.ex04_tree.map;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapMain2 {

	public static void main(String[] args) {
		// 2 . TreeMap 정렬하기
		// descendingMap(), descendingEnterSet()
		TreeMap<String,Integer> scores = new TreeMap<>();
		scores.put("손흥민",87);
		scores.put("이강인",98);
		scores.put("김민재",75);
		scores.put("나얼",95);
		scores.put("이적",80);
		
		
		
		
		
		
		
//		System.out.print("오름차순 : ");
//		for(Integer score:scores) {
//			System.out.println(score + ", ");
//		}
//		System.out.println();
		
//		System.out.print("내림차순 : ");
//		NavigableSet<Integer> descSet = scores.descendingKeySet();
//		for(Integer score:descSet) {
//			System.out.print(score + ", ");
//		}
//		System.out.println();
		
		
//		System.out.print("내림차순 -> 오름차순 : ");
//		NavigableSet<String>ascSet = descSet.descendingSet();
//		for(String score:ascSet) {
//			System.out.print(score + ", ");
//		}
//		System.out.println();
		
		
		
		NavigableMap<String, Integer> descSet = scores.descendingMap(); 
		System.out.print("내림차순 : ");
		for(Entry<String, Integer> entry: descSet.entrySet()) { 
		    System.out.print(entry.getKey() + ": " + entry.getValue() + ", ");
		}
		System.out.println();
		
		NavigableMap<String, Integer> ascSet = descSet.descendingMap(); 
		System.out.print("오름차순 : ");
		for(Entry<String, Integer> entry: ascSet.entrySet()) { 
			System.out.print(entry.getKey() + ": " + entry.getValue() + ", ");
		}
		System.out.println();

		
		
		
		
		
		
	}

}
