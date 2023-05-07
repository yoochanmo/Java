package com.lec.ex02_switch;

public class SWBlog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch문은 if문과 달리, 조건식으로 정수 값 또는 문자열 값을 사용한다.
		//다음과 같은 형식으로 작성된다.
		
//		switch (조건식) {
//		  case 값1:
//		    // 값1일 때 실행될 코드 블록
//		    break;
//		  case 값2:
//		    // 값2일 때 실행될 코드 블록
//		    break;
//		  // ...
//		  default:
//		    // 모든 case문이 만족하지 않을 때 실행될 코드 블록
			  
//		여기서 조건식은 정수 값 또는 문자열 값을 사용하며, case문은 해당 값에 대한 코드 블록을 정의한다. 
//		조건식과 값1, 값2 등의 비교 결과가 일치하는 case문에 해당하는 코드 블록이 실행된다. 
//		실행이 완료되면, break 문을 사용하여 switch문에서 빠져나올 수 있다.
//		만약, 모든 case문에 해당하지 않을 때 실행될 코드 블록이 필요하다면, 
//		 default문을 사용하여 정의할 수 있다.
			  
//		switch문은 if문보다 조건식을 비교하는 방식이 더 빠르며, case문의 사용으로 코드의 가독성은 정말 좋아지는것 같다.
//		예를 들어, 다음은 switch문을 사용하여 메뉴 선택에 대한 예시 코드이다.
			  
			 int menu = 2;

			 switch (menu) {
			   case 1:
			     System.out.println("메뉴 1을 선택하였습니다.");
			     break;
			    case 2:
			      System.out.println("메뉴 2를 선택하였습니다.");
			      break;
			    case 3:
			      System.out.println("메뉴 3을 선택하였습니다.");
			      break;
			    default:
			      System.out.println("잘못된 메뉴를 선택하였습니다.");
			      break;
			  }
 
		}
//		위 코드에서는 정수 값인 menu를 사용하여 선택한 메뉴에 대한 코드를 작성했다. 
//		menu 값이 2이므로, 두 번째 case문이 실행되어 "메뉴 2를 선택하였습니다." 라는 문자열이 출력이된다.
//		switch문은 조건식으로 정수 값 또는 문자열 값을 사용할 수 있다.
//		단, 조건식이 되는 값은 반드시 정수 값 또는 문자열 값이어야 하며, 
//		실수 값이나 boolean 값은 사용할 수 없다. 
//		또한, switch문에서 사용되는 break 문은 switch문에서 빠져나오는 역할을 한다.
//		break 문이 없으면, 해당 case문의 실행이 완료되더라도 다음 case문이 실행된다. 
//		이러한 동작은 switch문에서 원하지 않는 부작용을 일으킬 수 있으므로,
//		주의해야할 부분이므로, 반드시 break문을 사용하여 switch문을 제어해야 한다.
//		만약 break문이 없는 경우, 해당 case문에서 실행된 코드 블록 이후의 모든 case문의 코드 블록이 실행되게 된다.
// 		break는 반드시 사용해야한다.
		
		
	}


