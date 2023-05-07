package com.lec.ex04_member;

public class UsingThis {
	
int outfield = 10; // 클래스멤버
	
	public class Inner {
		int innerfield = 20; // 객체(로컬)멤버
		void method() { // 객체(로컬)멤버
			MyInterface fi = null;
			
			fi = () -> {
				System.out.println("아웃터필드 = " + outfield);
				System.out.println("아웃터필드 = " + UsingThis.this.outfield);
				
				System.out.println("이너필드 = " + innerfield);
				System.out.println("이너필드 = " + this.innerfield);
			};
			fi.method();
		}
	}
}