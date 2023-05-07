package com.lec.ex02_name;

/*
 	쓰레드이름
 	
 	Thread는 자신의 이름을 가지고 있다. 쓰레드의 이름이 큰 역할을 하는 것은 아니지만
 	디버깅할 때 어떤 쓰레드가 어떤 작업을 하는지 조사할 목적으로 가끔 사용된다.
 	
 	메인쓰레드는 "main"이라는 이름을 가지고 있고 개발자가 생성한 쓰레드는 자동적으로
 	"Thread-n"이라는 이름으로 설정된다. n은 쓰레드의 생성일련번호를 의미한다.
 	자동부여되는 이름 대신에 개발자가 이름을 부여하고 싶을 경우에는 Thread.setName()
 	메서드를 이용해서 설정하고 쓰레드 이름을 알고 싶을 경우 Thread.getName()메서드를
 	호출하면 된다.
 	
 	setName()과 getName()메서드는 Thread의 인스턴스(객체)멤버이기 때문에 쓰레드객체의 
 	참조가 필요하다. 만약 쓰레드 객체의 참조를 가지고 있지 않다면 Thread정적메서드인
 	currentThread()메서드로 코드를 실행하면 현재 쓰레드의 참조정보를 얻을 수 있다.
 */
public class ThreadMain {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 쓰레드이름 = " + mainThread.getName());
		
		Thread threadA = new ThreadA();
		System.out.println("작업중인 쓰레드이름 = " + mainThread.getName());
		threadA.start();
		
		Thread threadB = new ThreadB();
		System.out.println("작업중인 쓰레드이름 = " + mainThread.getName());
		threadB.start();
		
		Thread threadC = new ThreadB();
		System.out.println("작업중인 쓰레드이름 = " + mainThread.getName());
		threadC.start();
	}

}

