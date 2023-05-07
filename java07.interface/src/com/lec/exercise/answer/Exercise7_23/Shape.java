package com.lec.exercise.answer.Exercise7_23;

	abstract class Shape {

		Point p;

		Shape() {

			this(new Point(0, 0));

		}

		Shape(Point p) {

			this.p = p;

		}

		abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드


		Point getPosition() {

			return p;

		}

		void setPosition(Point p) {

			this.p = p;

		}

	}

	class Point {

		int x;

		int y;

		Point() {

			this(0, 0);

		}

		Point(int x, int y) {

			this.x = x;

			this.y = y;

		}

		public String toString() {

			return "[" + x + "," + y + "]";

		}

	}
	// Circle 클래스
	class Circle extends Shape {
	    double r; // 반지름

	    public Circle(double r) {
	        this.r = r;
	    }

	    @Override
	    double calcArea() {
	        return Math.PI * r * r;
	    }
	}

	// Rectangle 클래스
	class Rectangle extends Shape {
	    double width; // 폭
	    double height; // 높이

	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    @Override
	    double calcArea() {
	        return width * height;
	    }

	    // 정사각형인지 아닌지를 알려주는 메서드
	    public boolean isSquare() {
	        return width == height;
	    }
	}



	


