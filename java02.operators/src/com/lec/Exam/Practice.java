package com.lec.Exam;

public class Practice {

	public static void main(String[] args) {
		// 2 . 다음 코드를 실행했을 때 출력 결과는?  답) "31"
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println("『2번』");
		System.out.println(z);
		System.out.println("----------------------");
		
		// 3 . 다음 코드를 실행했을 때 출력 결과는? 답) "가"
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println("『3번』");
		System.out.println(result);
		System.out.println("-----------------------");
		
		// 4 . 534자루 연필을 30명의 학생들에게 나누어 줄때 학생당 몇개를 줄 수 있고 최종적으로
		// 	   몇 개가 남는지 구해라.
		int pencils = 534;
		int students = 30;
		System.out.println("『4번』");
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent =(pencils / students);
		System.out.println("학생 한 명이 가지는 연필수 = "+ pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = (pencils -(students * pencilsPerStudent));
		System.out.println("남은 연필수 = " + pencilsLeft);
		System.out.println("--------------------------------");
		
		// 5 . 십의 자리 이하 버리는 코드 변수 value의 값이 356이라면 300이 나올 수 있도록 코드작성
		//	   (산술 연산자만 사용하세요)
		System.out.println("『5번』");
		int value = 356;
		System.out.println(value - (value % 300));
		System.out.println("-------------------------------------");
		
		// 6 . 사다리꼴 넓이 구하는 코드 정확히 소수자릿수 나올 수 있도록 코드 작성
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area =((((double)lengthTop + lengthBottom) *  height) / 2);
		// (윗변 + 아랫변) * 높이 / 2
		System.out.println("『6번』");
		System.out.println(area);
		System.out.println("------------------------------");
		
		// 7 . 다음 코드는 비교 연산자와 논리 연산자의 복합 연산식 출력결과 넣어라.
		int x1 = 10;
		int y1 = 5;
		System.out.println("『7번』");
		System.out.println((x1 > 7) && (y1 <= 5));
		System.out.println((x1%3 == 2) || (y1%2 != 1) );
		
		System.out.println("------------------------------------");
		
		
		// 8 . % 연산 수행 결과값에 10 더한 코드 NaN 값을 검사해서 올바른 결과가 출력될 수 있도록
		//	   NaN을 검사하는 코드를 작성
		
		double x2 = 5.0;
		double y2 = 0.0;
		
		double z1 = x2%y2;
		System.out.println( "『8번』");
		if (Double.isNaN(z1)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}
		else {
			double result2 = z1 + 10;
			System.out.println("결과 : " + result2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
