package com.lec.ex05_protected.pkg2;

import com.lec.ex05_protected.pkg1.*;

public class C {
	
	void method_c() {
		
		// 다른 패키지의 클래스에 protected로 선언된 필드, 메서드,생성자는
		// 접근이 불가능하다.
        //  A a = new A();
		//	a.field1 = "문자열";
		//	a.field2 = "접근불가";
		//	a.method_a(); 접근불가
		
		// 다른 패키지에 있는 클래스를 import해왔을 경우
		// default로 선언된 field, method, 생성자 접근불가
		B b1 = new B(); // public 접근가능
		// b1.method_b(); default로 접근불가
		
		// B b2 = new B(10);  default로 접근불가
		
		
		
	}
	
}
