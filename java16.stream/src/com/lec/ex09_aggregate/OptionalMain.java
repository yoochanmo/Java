package com.lec.ex09_aggregate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalMain {

	public static void main(String[] args) {
		
		// List<Integer> list = new ArrayList<>();
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		try {
			
			double result = list.stream().mapToInt(Integer::valueOf).average().getAsDouble();
		} catch (Exception e) {
			System.out.println("try ~ catch : 저장된 값이 없습니다.");
		}
		
		// try ~ catch 이외의 예외처리방법(1) - isPresent(), 요소존재여부를 리턴
		OptionalDouble optional = list.stream().mapToInt(Integer::valueOf).average();
		if(optional.isPresent()) {
			System.out.println("평균값 = " + optional.getAsDouble());
		}else {
			System.out.println("isPresent() 메서드 : 저장된 요소가 없습니다.");
		}
		// try ~ catch 이외의 예외처리방법(2) - orElse(), 요소가 없을 경우 default값 처리
		double result = list.stream().mapToInt(Integer::valueOf).average().orElse(1000);
		System.out.println("orElse의 기본값 처리 : " + result);
		
		
		// try ~ catch 이외의 예외처리방법(3) - ifPresent()
		list.stream().mapToInt(Integer::intValue)
		.average().
		ifPresent(a -> System.out.println("ifPresent : 평균값 = " + a)); // 값이 있으면 처리. 없다면 처리 안함.
		
		
	}

}
