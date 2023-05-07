package com.lec.ex10_constructor;

public class Korean {
		
	// 1 . 필드
	String nation = "대한민국";
	String name;
	String ssn;
	int result;
	

	
	// 2 . 생성자 
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		this.result = this.add(1000,2000);
	}
	
	
	
	
	// 3 . 메서드
	public int add(int x, int y) {
	
		return x + y;
	}

	@Override
	public String toString() {
		return "Korean [name=" + name + ", ssn=" + ssn + ", result=" + result + "]";
	}

}


