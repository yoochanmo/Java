package com.lec.ex04_class;

/*
 	Class 클래스
 	
 	1 . Class 객체얻기(Class.forName(String str), Object.getClass(클래스이름))
 	
 		프로그램에서 Class객체를 얻기 위한 방법
 		1) Object클래스의 getClass()메서드와
 		2) Class클래스의 forName()메서드를 이용하는 방법
 		
 		Object는 모든 클래스의 최사위 클래스이므로 모든 클래스메서드에 getClass()메서드를 호출 할 수 있다.
 		getClass() 메서드는 해당 클래스의 객체가 생성되어 있을 때에만 사용할 수 있지만
 		객체가 생성되어 있지 않을 경우에 Class객체를 얻을 수가 없다.
 		
 		Class의 생성자는 private으로 선언되어 있기 때문에 new 객체생성연산자로 객체를 만들 수가 없다.
 		정적인 메서드 forName()을 이용해서 클래스 정보를 얻을 수 있다. forName()메서드는 클래스전체이름 즉, 패키지이름을
 		포함한 전체 클래스이름을 매개값을 전달 받아서 해당 클래스의 객체를 생성한 후에 그 객체를 리턴한다.
 		
 		Class.forName() 메서드는 클래스를 찾지 못했을 경우에 ClassNorFoundException예외를 발생시키기 때문에 예외처리를 해야 한다.
 		
 		
 	2 . Class 정보얻기(Reflection)
 	
 		getDeclaredConstructors(), getDeclaredFields(), getDeclaredMethod()등의 메서드를 이용해서
 		해당 클래스의 필드, 생성자, 메서드에 대한 정보를 얻을 수가 있다.
 		이 것을 리플렉션(Reflection)이라고 한다.
 */	

public class ClassMain {

	public static void main(String[] args) {
			
		// 1 . 객체를 생성하는 방법
		// 1) new 객채생성연산자로 생성하기
		Car car1 = new Car();
		System.out.println(car1.model);
		System.out.println(car1.getClass());
		// System.out.println(car1.getName());
		System.out.println();
		
		// 2 . getClass()
		Class car2 = car1.getClass();
		System.out.println(car2.getClass());
		System.out.println(car2.getName());
		System.out.println(car2.getSimpleName());
		System.out.println(car2.getPackage());
		System.out.println(car2.getPackage().getName());
		
		// 3 . forName()
		Class car3;
		try {
			car3 = Class.forName("com.lec.ex04_class.Car");
			System.out.println(car3.getClass());
			System.out.println(car3.getName());
			System.out.println(car3.getSimpleName());
			System.out.println(car3.getPackage());
			System.out.println(car3.getPackage().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Car{
	String model = "티코";
	int speed;
}





