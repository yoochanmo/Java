package com.lec.ex02_generic;




public class BoxMain {

	public static void main(String[] args) {
		

		Box<Apple> 과일상자 = new Box();
		과일상자.setObject(new Apple());
		
		// 제네릭은 컴파일단계에서 부터 에러발생을 방지할 수 있다.
		// 객체저장시에 사진에 특정 객체만 주입이 되도록 제한하는 방법이다.
		// 과일상자.setObject(new Hammer()); ( x )
		//과일상자.setObject(new String("홍길동"));
		//과일상자.setObject(Integer.valueOf(1));
		//과일상자.setObject(Double.valueOf(1.0));
		//과일상자.setObject('A');
		//과일상자.setObject(new int[] {1,2,3,4,5});
		
		// 주의사항
		// 좌변에만 제네릭을 정의하면 사전에 에러를 방지할 수 있지만
		// 우변에만 제네릭을 정의하면 non generic와 동일하다.
		// 즉, 우변에만 제네릭을 정의할 경우에는 객체제한을 할 수가 없다.
		Box<Apple> 과일상자1 = new Box();
		Box<Apple> 과일상자2 = new Box<>(); // 통상적인 선언방법
		Box<Apple> 과일상자3 = new Box<Apple>();
		Box 과일상자4 = new Box<Apple>(); // 제네릭으로 제한 불가
		
		Apple 사과 = (Apple) 과일상자.getObject();
		System.out.println(사과);
		
		Box<Hammer> 도구상자 = new Box();
		도구상자.setObject(new Hammer()); 
		// 도구상자.setObject(new Apple());
		Hammer 망치 = 도구상자.getObject();
		System.out.println(망치);
		
		Box<String> 문자상자 = new Box<>();
		문자상자.setObject(new String("찰리아담"));
		String 찰리아담 = 문자상자.getObject();
		System.out.println(찰리아담);
	}

}

class Box<T>{
	private T t;
	public T getObject() {return t;}
	public void setObject(T t){this.t = t;}
}
class Apple {
	@Override
	public String toString() {
	return "나는 사과입니다.";
	}
}
class Hammer {
	@Override
	public String toString() {
		return "나는 망치입니다.";
	}
}
