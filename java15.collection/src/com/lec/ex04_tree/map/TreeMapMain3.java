package com.lec.ex04_tree.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapMain3 {

	public static void main(String[] args) {
		// 3 . 범위검색하기
		
		
		TreeMap<String, Integer> words = new TreeMap<>();
		words.put("apple",10 );
		words.put("orange",20 );
		words.put("banana",25 );
		words.put("cherry",10 );
		words.put("mango",30 );
		words.put("pear",28 );
		words.put("for",40 );
		words.put("f",45 );
		words.put("c",50 );
	
				
		// c ~ f 사이의 단어검색
		NavigableMap<String, Integer> rm = words.subMap("c", false, "p", false);
		for(Map.Entry<String, Integer> entry : rm.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
