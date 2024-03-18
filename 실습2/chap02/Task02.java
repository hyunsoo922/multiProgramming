package chap02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        num = in.nextInt();

        String s;
         s = num % 2 == 0 ? "짝수"  : "홀수";
        System.out.println(s);

    }
}