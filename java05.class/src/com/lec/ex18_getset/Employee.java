package com.lec.ex18_getset;

import java.util.Date;

// DTO, Model, Entity....용어
public class Employee {
	
	private int empno;
	private String ename;
	private Date hiredate;
	private int sal;
	private int deptno;
	private boolean adult;
	private String ssn;
	private boolean 질병;
	private boolean 관리자;
	
	

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", ssn=" + ssn + "]";
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empno, String ename, Date hiredate, int sal, int deptno, boolean adult, String ssn) {
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno;
		this.adult = adult;
		this.ssn = ssn;
	}
	
	


	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public boolean is질병() {
		return 질병;
	}
	public void set질병(boolean 질병) {
		this.질병 = 질병;
	}
	public boolean is관리자() {
		return 관리자;
	}
	public void set관리자(boolean 관리자) {
		this.관리자 = 관리자;
	}
	
	

}
