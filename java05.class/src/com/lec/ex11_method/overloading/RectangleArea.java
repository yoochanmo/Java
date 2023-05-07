package com.lec.ex11_method.overloading;

public class RectangleArea {

		// 정사각형의 넓이
		int areaRectangle(int width) {
			return width * width;
		}
		// 직사각형의 넓이 - overloading
		int areaRectangle(int width, int height) {
			return width * height;
			
		}
}
