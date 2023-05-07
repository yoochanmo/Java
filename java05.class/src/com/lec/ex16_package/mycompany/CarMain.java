package com.lec.ex16_package.mycompany;


import com.lec.ex16_package.hankook.SnowTire;
import com.lec.ex16_package.hyundai.Engine;
import com.lec.ex16_package.kumho.BigWidthTire;
/*
 	패키지(package)
 	
 	프로그램을 개발하다 보면 객체는 수십개, 많게는 수백개의 클래스를 작성해야한다.
 	클래스를 체계적으로 관리하지 않으면 클래스간의 관계가 뒤엉켜서 복잡하고 난해한
 	프로그램이 되어 버려 결국에는 유지보수가 어렵게 된다.
 	
 	자바에서는 클래스를 체계적으로 관리하기 위해서 패키지를 사용한다. PC에서 파일을
 	분류, 저장해서 파일을 그룹화해서 관리하는 것 처럼 Java에서는 패키지를 만들어서
 	유사한 기능을 하는 클래스들 끼리 그룹화해서 저장,관리하도록한다.
 	
 	패키지의 물리적인 형태는 파일시스템의 폴더이다. 패키지는 단순히 파일시스템의 폴더
 	기능만 하는 것이 아니라 "클래스의 이름의 일부분"이다. 즉, 클래스이름은 패키지명을
 	포함한 클래스파일명 전체가 클래스 이름이다.
 	
 	패키지는 클래스를 유일하게 만들어 주는 역할을 한다. 즉, 클래스의 파일이름이 동일
 	하더라도 패키지가 틀리다면 다른 클래스로 인식한다.
 	
 	클래스 전체이름은 "패키지명.하위패키지명.클래스명"인데 상위, 하위로 구분이 되어
 	있다면 dot(.)구분자로 구분이 된다.
 	
 	패키지의 선언은 자바의 명명규칙을 준수하는데 관례적으로 패키지명은 전부 소문자로 정의한다.
 	
 */

public class CarMain {

	public static void main(String[] args) {
		Engine engine = new Engine();
		com.lec.ex16_package.hankook.Tire flt = new com.lec.ex16_package.hankook.Tire();
		com.lec.ex16_package.kumho.Tire blt = new com.lec.ex16_package.kumho.Tire();

		// ctrl + shift + o : 일괄 임포트 단축키
		SnowTire frt = new SnowTire();
		BigWidthTire brt = new BigWidthTire();
		
		System.out.println("My Car 한대가 생산되었습니다");
	}

}
