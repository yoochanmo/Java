package com.lec.ex11_method.declare;

/*
 	메서드(method)
 	
 	
 	메서드는 객체의 동작에 해당하는 중괄호{}블럭을 갖는다. 중괄호 블럭은 이름을 가지고 있는데
 	이 것이 메서드이름이다. 메서드를 호출하게 되면 이 중괄호 블럭에 있는 실행문들이 일괄적으로
 	실행된다.
 	
 	메서드는 
 			1) 필드를 읽거나 수정
 			2) 다른 객체를 생성해서 다양한 기능을 수행한다. 메서드는 객체간의 데이터 전달수단으로 사용된다.
 			   메서드는 외부로 부터 매개값을 받을 수 있고 실행한 후에 그 결과를 리턴할 수 있다.
 			   
 			   1 . 메서드 선언
 			   
 			   	   메서드의 선언은 선언부와 실행부로 구성된다. 선언부에는 접근제한자, 리턴타입, 메서드이름과 
 			   	   매개변수등을 선언하고 이 선언부를 매서드 시그니처(method signature)라고도 한다. 메서드의
 			   	   실행부는 중괄호{}블럭을 말한다.
 			   	   
 			   2 . 리턴타입
 			   		
 			   	   리턴타입은 메서드가 실행한 결과를 리턴할 때 그 값의 데이터타입을 말한다. 메서드는 리턴값이
 			   	   있을 수도 있고 없을 수도 있다. 리턴값이 없을 경우에는 '리턴타입을 void'로 선언하고 있을 경우에는
 			   	   반환되는 값의 데이터타입(기본타입,참조타입)을 정의한다.
 			   	   
 			   3 . 메서드 명명규칙 
 			   
 			   	   1 ) 숫자로 시작불가
 			   	   2 ) $,_를 제외한 특수문자 사용불가
 			   	   3 ) 관례로 메서드의 이름은 소문자로 시작
 			   	   4 ) 카멜케이스를 준수
 */
public class Calculator {

	// 실습. 사칙연산을 하는 기능을 가진 계산기 클래스를 구현하기
	// poweOn, add, sub, mul, div, powerOff 메서드를 구현
	// powerOn/Off를 제외한 4가지 메서드는 리턴값이 있게 구현
	
	
	public void powerOn() {
		System.out.println("ON");
		
	}
	public int add1(int x, int y) {
		return x + y;
	}
	public int sub(int x, int y) {
		return x - y;
	}
	public int mul(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
	
	public int powerOff() {
		System.out.println("OFF");
		return 0;
		
	}
	
	String xxx() {
		if(true) {
			return "true : 참조타입 String (문자열)을 반환했습니다!";
		}else {
			return "false : 참조타입 String (문자열)을 반환했습니다!";
		}
	}
		
	String yyy(){
		return new String("참조타입");
	}
	
	Calculator zzz(){
//		Calculator cal = new Calculator();
//		return cal;
		return new Calculator();
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

























