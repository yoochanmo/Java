package com.lec.exercise.answer.Exercise8_9;

// 8 - 9 다음과 같은 조건의 예외클래스를 작성하고 테스트하시오.
public class Exercise8_9 {

	public static void main(String[] args) {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);

	}

}

class UnsupportedFuctionException extends RuntimeException{
	private int ERR_CODE = 100;
	
	UnsupportedFuctionException(String msg, int errCode){
		super(msg); // 조상의 생성자 RuntimeException (String msg) 호출
		
		ERR_CODE = errCode;
	}
	
	UnsupportedFuctionException(String msg){
		this(msg, 100); // ERR_CODE를 100(기본값)으로 초기화
	}

	public int getErrCode() {
		return ERR_CODE;
	}
	
	public String getMessage() { 
		return "[" + getErrCode() + "]" + super.getMessage();
		
	}


	}
