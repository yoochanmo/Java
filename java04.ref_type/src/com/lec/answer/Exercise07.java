package com.lec.answer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {

        boolean run = true;
        double pocket = 0;
        
        DecimalFormat df = new DecimalFormat("#,###");
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 > ");
            double num = scanner.nextInt();
            double money = 0;

            if (num == 1) {
                System.out.print("예금액 > ");
                money = scanner.nextInt();
                pocket += money;

            } else if (num == 2) {
                System.out.print("출금액 > ");
                money = scanner.nextInt();
                pocket -= money;

            } else if (num == 3) {
                System.out.println("잔액조회 > " + df.format(pocket));

            } else {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
