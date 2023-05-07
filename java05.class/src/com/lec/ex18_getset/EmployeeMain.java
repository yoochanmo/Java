package com.lec.ex18_getset;

import java.util.Date;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setEmpno(7968);
		System.out.println("사원번호 = " + emp.getEmpno());
		
		emp.setAdult(true);
		System.out.println("성인여부 = " + emp.isAdult());
		
		emp.set질병(true);
		System.out.println("질병여부 = " + emp.is질병());
		System.out.println();
		Employee emp1 = new Employee(1000,"홍길동",new Date(), 10000,10,true,"991234-5678912");
		Employee emp2 = new Employee(1000,"홍길순",new Date(), 1000,20,true,"991234-7678912");
		Employee emp3 = new Employee(1000,"홍길자",new Date(), 2000,30,true,"901234-2678912");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println("======================================");
	    String[] str = {"손흉민","이강인","김민재"};
	    
	    Employee[] employee = {emp1,emp2,emp3, new Employee(),
	    			new Employee(1000,"손흥민",new Date(), 10000,10,true,"991234-5678912")};
	    for(Employee employee1 : employee) {
	    	System.out.println(employee1.toString());
	    }
	    

	}

}
