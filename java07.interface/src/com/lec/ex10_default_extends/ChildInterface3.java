package com.lec.ex10_default_extends;

public interface ChildInterface3 extends ParentInterface {
	
	void method3();
	
	@Override
	void method2(); // default 메서드를 추상메서드로 재선언
}
