package com.lec.ex10_default_extends;

public interface ParentInterface {

		void method1();
		default void method2() {/* 실행블럭 */}
}
