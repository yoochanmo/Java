package com.lec.ex03_system;

import java.util.Map;

/*
 	System 클래스
 	
 	자바프로그램은 운영체제에서 실행되는 것이 아니라 JVM위에서 실행되기 때문에 운영체제의 모든 기능을
 	자바코드가 직접 수행(개발)하기란 매우 어려운 작업이다.
 	하지만, java.lang.System클래스를 이용하면 운영체제의 일부기능들을 이용할 수 있다.
 	
 	프로세서의 종료(exit), 키보드 입력(scanner()), 콘솔입출력(in()), out()), 메모리정리(gc())
 	현재시간(nanotime()...)등의 정보를 얻을 수가 있다.
 	
 	1 . 프로그램종료(exit())
 	
 		경우에 따라서 프로세스(JVM)을 강제로 종료시킬 필요가 있는 경우도 있다. 이때 System.exit(int)메서드를 호출하면
 		현재 실행하고 있는 프로세스를 강제로 종료시킬 수가 있다.
 		
 		exit() 메서드는 int매개값을 지정하도록 되어 있는데 이 값을 종료상태값이라고 한다. 정상종료일 경우는 0,
 		비정상종료일 경우는 "0이외의 값"을 지정한다.
 		
 	2 . 쓰레기수집(gc())
 	
 		쓰레기 수집기는 개발자가 직접 코드를 실행시킬 수 없고 JVM에게 가능한 빠른 시간내에 실행하도록 요청할 수 있다.
 		이 기능을 하는 것이 System.gc() 메서드이다. gc메서드는 호출하면 곧바로 실행되는것이 아니라 JVM이 빠른 시간내에 실행
 		시키기 위해 노력한다.
 		
 	3 . OS 환경정보(getenv())
 	
 		getenv() 메서드는 시스템의 운영체제의 환경정보를 읽을 수가 있다.
 		
 	4 . 현재시간(currentTimeMills(), nanoTime())
 	
 		System클래스의 currentTimeMills, nanoTime 메서드는 컴퓨터시계로 부터 현재시간을 읽어서 밀리세컨드(1/1000),
 		나노세컨드(1/10^9)단위의 long타입의 값을 리턴한다. 이 메서드는 주로 프로그램의 소요시간을 측정하는데 사용된다.
 		
 */

public class SystemMain {

	public static void main(String[] args) {
		
		// 1 . exit()
		if(args.length > 3) {
			System.out.println(" 프로그램 비정상종료 ");
			System.exit(1000);
		}
		
		// 2 . gc()
		Employees emp = null;
		for(int i = 0; i < 3; i++) {
			emp = new Employees(i);
			if(i==1) emp = null;
		}
		System.out.print("emp가 최종적으로 참조하는 사원번호 = ");
		System.out.println(emp.empno);
		System.gc();
		System.out.println();
		
		// 3 . getenv()
		String java_home = System.getenv("JAVA_HOME");
		System.out.println(java_home);
		System.out.println(System.getenv("MONGDB_HOME"));
		System.out.println();
		
		
		// os의 환경정보
		for(Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		System.out.println();
		
		
		
		System.out.println("프로그램종료");
	}

}

	class Employees{
		int empno;
		public Employees(int empno) {
			this.empno = empno;
			System.out.println("Employees( " + this.empno + ")가 메모리에서 생성되었습니다.");
		}
		
		@Override
		protected void finalize() throws Throwable {
			System.out.println("Employees( " + this.empno + ")가 메모리에서 제거되었습니다.");
			
		}
	}
