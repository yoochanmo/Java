package com.lec.ex01_nongeneric;

public class BoxMain {

	public static void main(String[] args) {
		Box 과일상자 = new Box();
		과일상자.setObject(new Apple());           // 자동형변환 Apple -> Object
		Apple 사과 = (Apple) 과일상자.getObject(); // 강제형변환 Object -> Apple
		// System.out.println(사과);
		System.out.println("과일상자 = " + 사과.getClass());
		과일상자.setObject(new Hammer());
		Hammer 망치 = (Hammer) 과일상자.getObject();
		// System.out.println(망치);
		System.out.println("과일상자 = " + 망치.getClass());
		
		
		
		System.out.println();
		
		
		Box 도구상자 = new Box();
		도구상자.setObject(new Hammer()); 				// 자동형변환 Hammer -> Object
		망치 = (Hammer) 도구상자.getObject();    // 강제형변환 Object -> Hammer
		System.out.println(망치);
		System.out.println("도구상자 = " + 망치.getClass());
		
		도구상자.setObject(new Apple());
		사과 = (Apple)도구상자.getObject();
		System.out.println("도구상자 = " + 사과.getClass());
		
		도구상자.setObject(new String("아담"));
		String 아담 = (String) 도구상자.getObject();
		System.out.println("도구상자 = " + 아담.getClass());
		
		과일상자.setObject(new String("홍길동"));
		과일상자.setObject(Integer.valueOf(1));
		과일상자.setObject(Double.valueOf(1.0));
		과일상자.setObject('A');
		과일상자.setObject(new int[] {1,2,3,4,5});
		
		
		System.out.println();
	}

}

class Box {	
	private Object object;
	public Object getObject() { return this.object; }
	public void setObject(Object object) { this.object = object; }
}

class Apple {}
class Banana {}
class Hammer {}
class Driver {}