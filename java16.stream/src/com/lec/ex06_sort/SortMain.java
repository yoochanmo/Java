package com.lec.ex06_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortMain {

	public static void main(String[] args) {
		// 1 . 기본타입정렬
		IntStream stream = Arrays.stream(new int[] {5,3,4,1,2});
		stream.forEach(System.out::println);
		System.out.println();
		
		stream = Arrays.stream(new int[] {5,3,4,1,2});
		stream.sorted().forEach(System.out::println);
		System.out.println();
		
			
		// 2 . 참조타입정렬(Member)
		List<Member> members = Arrays.asList(
				new Member(3,"홍길동"),
				new Member(1,"홍길순"),
				new Member(2,"홍길녀")
				);
		
		members.stream().forEach(m -> System.out.println(m.toString()));
		System.out.println();
		
		members.stream().forEach(m -> System.out.println(m));
		System.out.println();
		
		members.stream().forEach(System.out::println);
		System.out.println("------------------------------------------------------------------");

		// sorted - 오름차순
		members.stream().sorted().forEach(m -> System.out.println(m.toString()));
		System.out.println();
		
		// sorted - 내림차순
		members.stream().sorted(Comparator.reverseOrder()).forEach(m -> System.out.println(m.toString()));
		System.out.println();
		
		
		
	}

}

class Member implements Comparable<Member>{
	public int no;
	public String name;
	
	public Member(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Member m) {
		
		//return Integer.compare(this.no, m.no); //번호순정렬
		return this.name.compareToIgnoreCase(m.name);
	}
	
}