package com.lec.ex02_supercall;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student("홍길동","991234-1234567",1000);
		System.out.println(student.toString());
		
		Student student2 = new Student();
		student2.studentNo = 2000;
		student2.name = "손흉민";
		student2.ssn = "123456-1234567";
		System.out.println(student2.toString());
	}

}
