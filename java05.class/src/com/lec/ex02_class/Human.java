package com.lec.ex02_class;

public class Human {
	
	
		// 1 . 속성(필드)
		String nation = "대한민국";
		String name;
		String gender;
		int age;
		
		// 2 . 생성자
		// 생성자오버로딩 - 다형성
		public Human() {}
		public Human(String name) {
			this.name = name;
		}
		public Human(String name, String gender) {}
		public Human(String name, String gender, int age) {
			this.name = name; // 객체 자기 자신
			this.gender = gender;
			this.age = age;
		}
		public Human(String name,int age, String gender) {}
	
		
	
		// 3 . 메서드
		// 상속받은 메서드 재정의
		// 메서드 오버라이딩
//	public String toString() {
//		return this.name + "," + this.gender+ ","+ this.age;
//	}
		@Override // @ 애너테이션, 메타정보, 컴파일시에 toString()부모메서드를 재정의여부를 확인
		public String toString() {
			return "Human [nation=" + nation + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
		}
	
	}
