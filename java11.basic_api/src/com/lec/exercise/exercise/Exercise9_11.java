package com.lec.exercise.exercise;

public class Exercise9_11 {

	public static void main(String[] args) {

		int from = 0;

		int to = 0;

		try {

			if(args.length != 2){

				System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");

				System.exit(0);
			}
			
			from = Integer.parseInt(args[0]);
			to = Integer.parseInt(args[1]);
			
			if(from < 2 || from > 9 || to < 2 || to > 9 ){

				System.out.println("단의 범위는 2와 9사이의 값이어야 합니다.");
			}
			} catch(Exception e) {

			System.out.println(e.getMessage());

			System.out.println("USAGE : GugudanTest 3 5");

			System.exit(0);

		}
		
		if(from > to) {
		   int tmp = from;

		from = to;

		to = tmp;

		}	

		for(int i = from; i <= to; i++){

		for(int j=1; j<=9; j++){

		System.out.println(i +"*"+j+"="+i*j);

		}    

		System.out.println();

		}

		}
}