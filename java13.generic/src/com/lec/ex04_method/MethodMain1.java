package com.lec.ex04_method;

/*
 	제네릭메서드
 	
 	<T> 리턴타입<T> 메서드명(T,t) {}
 	
 	제네릭메서드는 매개타입과 리턴타입으로 타입파라미터를 갖는 메서드를 말한다. 제네릭메서드를 
 	선언하는 방법은 리턴타입앞에 <>를 추가하고 타입파라미터를 기술한 후에 리턴타입과 매개타입으로
 	타입파라미터를 사용하면 된다.
 	
 	public <T> 리턴타입<T> 메서드명(T,t) {return 리턴타입}
 	
 	제네릭메서드는 2가지 방식으로 호출할 수 있다. 코딩할 때 타입파라미터의 구체적인 타입을 명시적으로
 	지정해도 되고, 컴파일러가 매개값의 타입으로 보고 구체적인 타입을 추가하도록 할 수 있다.
 	
 */
public class MethodMain1 {

	public static void main(String[] args) {
		
		// 1 . 제네릭메서드
		Box<Integer> box1 = Util.boxing(1000);
		System.out.println(box1.get());
		
		Box<String> box2 = Util.boxing(new String("망치"));
		System.out.println(box2.get());
		
		Box<Apple> box3 = Util.boxing(new Apple());
		System.out.println(box3.get());
		
		Box<Car> box4 = Util.boxing(new Car());
		System.out.println(box4.get());
	
		System.out.println();
		
		
		
		
		// 2 . 일반메서드
			   Box g_box1 = null;
//			   Box g_box = Util.method(1000);
//			   Box g_box = Util.method(new String("망치"));
			   
			   g_box1 = Util.method(new Robot());
			   System.out.println(g_box1.get());
		   

	}

}

class Box<T>{
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}
}

class Util{
	
	// 1 . 일반메서드
	public static Box method(Robot robot) {
		Box box = new Box();
		box.set(new Robot());
		//box.set(new String("망치"));
		return box;
	}
	// 2 . 제네릭메서드
	public static <T>Box<T> boxing(T t){
		Box<T> box = new Box();
		box.set(t);
		return box;
	}
}

class Robot{
	@Override
	public String toString() {
		return "나는 바보입니다";
	}
}
class Apple{
	@Override
	public String toString() {
		return "나는 사과에요";
	}
}
class Car{
	@Override
	public String toString() {
		return "나는 현기입니다.";
	}
}