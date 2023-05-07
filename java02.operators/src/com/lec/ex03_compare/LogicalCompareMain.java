package com.lec.ex03_compare;

public class LogicalCompareMain {

	public static void main(String[] args) {
		// 논리연산자(&&, &, ||, |, ^, !)
		// 논리연산자는 논리곱(&&, &), 논리합(||,|), 배타적논리합(XOR, ^), 논리부정(!)
		// 연산을 수행한다. 논리연산자의 피연산자는 boolean타입만 사용할 수 있다.
		
		// 논리곱연산자인 &&와 &는 산출결과는 같지만 연산과정이 조금 다른다. &&은 앞의
		// 피연산자가 false라면 뒤의 연산은 비교하지 않고 false를 리턴하지만 &는 두 피연산자를 모두 비교해서
		// 산출결과를 리턴한다. 따라서 & 보다 &&이 더 효율적으로 동작한다.
		
		// 논리합연산자인 || 와 | 도 마찬가지이다. ||는 앞의 연산이 true라면 뒤의 연산은
		// 수행하지 않고 true를 리턴하지만 |는 두 연산을 모두 수행해서 그 결과를 리턴한다.
		// 따라서 |보다 ||연산이 보다 더 효율적으로 동작한다.
		
		int charCode = 'a';
		
		if((charCode >= 65) && (charCode <= 90)) {
				System.out.println("대문자입니다");
		}
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자입니다");
		}
		if((charCode >= 48) && (charCode <= 57)) {
			System.out.println("숫자입니다");
		}
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) {
			System.out.println(value + "은(는) 2또는 3의 배수 입니다.");
		}
		if((value%2==0) || (value%3==0)) {
			System.out.println(value + "은(는) 2또는 3의 배수 입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
