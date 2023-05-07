package com.lec.ex10_default_extends;

public interface ChildInterface2 extends ParentInterface{
	
	void method3();
	
	@Override
	default void method2(){/* 실행블럭 */}

}
