package com.lec.ex03_multi_type;

/*
 	제네릭(Generic)
 	
 	자바 5부터 제네릭타입이 새롭게 추가되었다. 제네릭타입을 사용하게 되면 잘못된 타입이 사용되는 가능성을 컴파일단계부터
 	제거 할 수 있게 되었다. 제네릭은 컬렉션, 람다식, 스트림, NIO(New Input Output)에 널리 사용되기 떄문에 제네릭을
 	이해하지 못한다면 자바의 API문서등을 이해할 수 없다.
 	
 	제네릭은 클래스와 인터페이스, 메서드를 정의할 때 타입을 매개값으로 사용할 수 있도록 한다. 타입파라미터는
 	코드 작성시에 구체적인 타입으로 선언되어서 다양한 객체들을 생성할 수 있도록 한다.
 	
 	제네릭을 사용하는 이점은
 	
 	1 . 컴파일시에 강한 타입체크를 할 수 있다.
 		
 		자바 컴파일러는 코드에서 잘못 사용되는 타입때문에 발생하는 문제들을 사전에 제거하기 위해 제네릭코드에서
 		강한 타입체크를 한다. 실행시에 타입에러가 발생하는 것보다 컴파일시에 미리 타입을 강하게 제한해서 에러를 
 		미연에 방지할 수 있다.
 		
 	2 . 타입변환 제거한다.
 	
 		비제네릭코드는 불필요한 타입변환을 하기 때문에 프로그램성능에 악영향을 미치게 된다. 제네릭을 사용하면
 		사전에 정해진 타입으로만 제한 시키기 때문에 불필요한 타입변환을 할 필요가 없어 프로그램의 성능이 향상 된다.
 		
 		제네릭문법
 		
 		제네릭타입(클래스<T>, 인터페이스<T>)
 		
 		제네릭타입은 타입을 파라미터로 갖는 클래스와 인터페이스를 말한다. 제네릭 타입은 클래스 또는 인터페이스이름
 		뒤에 다이아몬드부호 "<>"를 붙이고 사이에 타입파라미터가 위치한다. 타입파라미터는 변수명과 동일한 규칙에 따라
 		선언이 가능하지만 일반적으로 대문자 알파벳 한글자로 선언한다. 
 	
 */
public class ProductMain {

	public static void main(String[] args) {
			
		// 1 . non generic
		Product product = new Product();
		product.setKind(1);
		int num = (int) product.getKind();
		product.setKind("문자열");
		String str = (String) product.getKind();
		
		product.setKind(3.14f);
		float flt = (float) product.getKind();
		
		product.setKind(new Robot());
		Robot robot = (Robot) product.getKind();
		
		product.setKind(new Car());
		Car car = (Car) product.getKind();
		
		product.setKind(new TV());
		TV tv = (TV) product.getKind();
		
		
		// 2 . generic
		Product<Robot,String> 로봇 = new Product<>();
		로봇.setKind(new Robot());
		로봇.setModel("Super");
		System.out.println(로봇.getKind() + 로봇.getModel() + "로봇입니다.");
		로봇.setModel("Standard");
		System.out.println(로봇.getKind() + 로봇.getModel() + "로봇입니다.");
		로봇.setModel("Cheap");
		System.out.println(로봇.getKind() + 로봇.getModel() + "로봇입니다.");
		System.out.println();
		//로봇.setKind(1);
		//로봇.setKind("문자");
		//로봇.setKind(new Car());
		
		Product<Car,String> 자동차 = new Product<Car,String>();
		자동차.setKind(new Car());
		자동차.setModel("티코");
		System.out.println(자동차.getModel());
		자동차.setModel("황금마티즈");
		System.out.println(자동차.getModel());
		System.out.println();
		
		Product<TV,String> 텔레비젼 = new Product();
		텔레비젼.setKind(new TV());
		텔레비젼.setModel("LED TV");
		System.out.println(텔레비젼.getModel());
		텔레비젼.setModel("국방 TV");
		System.out.println(텔레비젼.getModel());
		System.out.println();
		
		// 제네릭타입은 참조타입만 가능
		Product<TV,Car> 잡동사니1  = new Product();
		Product<Car,TV> 잡동사니2  = new Product();
		Product<Car,Car>잡동사니3  = new Product();
		Product<TV,Robot> 잡동사니4  = new Product();
		Product<String,Car> 잡동사니5  = new Product();
		Product<String,String> 잡동사니6  = new Product();
		Product<Integer,String> 잡동사니7  = new Product();
		Product<int[],Student> 잡동사니8  = new Product();
		
		// 참조타입이 아닌 경우
		// Product<int,String> 잡동사니8  = new Product();
	}

}

class Product<K,M>{
	private K kind;
	private M model;
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}

class Robot{
	@Override
	public String toString() {
		return "나는";
	}
}
class Car{}
class TV{}
class Student{}