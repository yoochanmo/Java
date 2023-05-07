package com.lec.ex11_method.overloading;

public class RectangleAreaMain {

	public static void main(String[] args) {
		
		// 메서드의 오버로딩
		RectangleArea ra = new RectangleArea();
		int result = ra.areaRectangle(20);
		System.out.println("정사각형의 넓이 = " + result);

		result = ra.areaRectangle(30, 10);
		System.out.println("직사각형의 넓이 = " + result);
	}

}
