package com.lec.ex04_tree.set;

import java.util.*;

/*
 	TreeSet
 	
 	TreeSet은 이진트리(Binary Tree)를 기반으로 한 set컬렉션이다. 하나의 노드는 노드값인 value와 
 	왼쪽,오른쪽 노드를 참조하기 위한 2개의 변수로 구성된다.
 	TreeSet객체를 저장하면 자동으로 정렬되는데 부값과 비교해서 작은 값은 왼쪽, 큰 값은 오른쪽
 	자식노드에 저장된다.
 	
 	TreeSet은 Set인터페이스타입변수에 대입해도 되지만 TreeSet클래스 타입으로 하는 이유는 객체를
 	검색하거나 범위검색과 관련된 메서드를 사용하기 위해서 있다.
 */
public class TreeSetMain1 {

	public static void main(String[] args) {
		
		// 1. TreeSet값 꺼내오기
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(Integer.valueOf(98));
		scores.add(75);
		scores.add(95);
		scores.add(80);
		scores.add(80); // 중복저장불가
		System.out.println("총 객체수 = " + scores.size());
		
		// 가장 낮은 점수, 가장 높은 점수, 95바로 아래 점수, 95 바로 위 점수
		Integer score = 0;
		
		score = scores.first();
		System.out.println("가장 낮은 점수 = " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 = " + score);
		
		score = scores.lower(95);
		System.out.println("95의 바로 아래 점수 = " + score);
		
		score = scores.higher(95);
		System.out.println("95의 바로 위 점수 = " + score);
		
		score = scores.floor(94);
		System.out.println("94이거나 바로 아래 점수 = " + score);
		
		score = scores.ceiling(96);
		System.out.println("96이거나 바로 위 점수 = " + score);
		System.out.println();
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst(); // 가장 작은 값부터 꺼내오고 삭제
			//score = scores.pollLast(); // 가장 큰 값부터 꺼내오고 삭제
			System.out.println(score + ", 남은 객체 수 = " + scores.size());
		}
		
		}

}
