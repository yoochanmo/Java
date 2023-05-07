package Exercise.answer;

import java.text.DecimalFormat;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(1000000);
        System.out.println("현재 잔고는요 " + getFormattedBalance(account.getBalance()));

        account.setBalance(998000);
        System.out.println("현재 잔고는요 " + getFormattedBalance(account.getBalance()));

        account.setBalance(800000);
        System.out.println("현재 잔고는요 " + getFormattedBalance(account.getBalance()));

        account.setBalance(25500);
        System.out.println("현재 잔고는요 " + getFormattedBalance(account.getBalance()));
    }

    private static String getFormattedBalance(int balance) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(balance);
    }
}
