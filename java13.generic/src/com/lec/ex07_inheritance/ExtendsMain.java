package com.lec.ex07_inheritance;

/*
 	제네릭타입의 상속(extends)과 구현(implements)
 	
 	
 	제네릭타입도 다른 타입과 마찬가지로 부모클래스가 될 수 있다.
 	부모클래스에서 상속받은 자식클래스는 부모클래스에 정의돈 타입을 정의해야 한다.
 	
 	또한, 자식클래스는 타입파라미터를 추가할 수 있으며 제네릭인터페이스를 구현한
 	클래스에서도 제네릭타입으로 정의되어야 한다.
 */

public class ExtendsMain {

	public static void main(String[] args) {
		// 1 . 클래스(Product)
		ChildProduct<TV, String, String> tv = new ChildProduct<>();
		tv.setKind(new TV());			// 부모의 제네릭타입
		tv.setModel("Smart 샤오미 TV"); // 부모의 제네릭타입
		tv.setCompany("샤오미");        // 자식의 제네릭타입
		System.out.println(tv.toString());
		System.out.println();
		
		ChildProduct<Car, String, String> car = new ChildProduct<>();
		car.setKind(new Car());
		car.setModel("티코");
		car.setCompany("GM대우");
		System.out.println(car.toString());
		System.out.println();
		
		
		// 2 . 인터페이스(Storage)
		Storage<TV> tv창고 = new Storagelmpl<>(100);
		tv창고.add(new TV(), 10); // 10번 위치
		TV tv1 = tv창고.get(10);
		System.out.println(tv1.getClass());
		
		Storage<Car> 자동차창고 = new Storagelmpl<>(10);
		자동차창고.add(new Car(), 1); // 1번랙
		Car car1 = 자동차창고.get(1);
		System.out.println(car1.getClass() );
		

	}

}
