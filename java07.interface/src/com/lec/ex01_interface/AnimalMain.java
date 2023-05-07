package com.lec.ex01_interface;

public class AnimalMain {

	public static void main(String[] args) {
		
		
		// interface도 추상클래스처럼 객체를 생성할 수 없다.
		// Animal animal = new Animal();
		
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Bird());
	}
	
	private static void animalSound(Animal animal) {
		animal.sound();
		animal.breath();
	}
	

}

class Bird implements Animal{
	@Override
	public void sound() {
		System.out.println("짹짹~");
		
	}
	
		
}