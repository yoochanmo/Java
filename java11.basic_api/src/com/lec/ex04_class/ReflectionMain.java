package com.lec.ex04_class;

import java.lang.reflect.*;


public class ReflectionMain {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class _class = Class.forName("java.lang.String");
		// Class _class = Class.forName("com.lec.ex04_class.Car");
		
		// 1. 클래스의 정보
		System.out.println("1. 클래스이름");
		System.out.println(_class.getName());
		System.out.println();
		
		// 2. 생성자의 정보
		System.out.println("2. 생성자정보");
		Constructor[] constructors = _class.getDeclaredConstructors();
		System.out.println("생성자의 갯수 = " + constructors.length);
		for(Constructor constructor:constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameter(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		// 3. 메서드의 정보
		System.out.println("3. 메서드정보");
		Method[] methods = _class.getDeclaredMethods();
		System.out.println("메서드의 갯수 = " + methods.length);
		
		for(Method method:methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameter(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		// 4. 필드의 정보
		System.out.println("4. 필드정보");
		Field[] fields = _class.getDeclaredFields();
		for(Field field:fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}

	}

	private static void printParameter(Class[] parameters) {
		
		for(int i=0;i<parameters.length;i++) {
			System.out.print(parameters[i].getName());
			if(i<parameters.length-1) {
				System.out.print(",");
			}
		}
		
	}

}

