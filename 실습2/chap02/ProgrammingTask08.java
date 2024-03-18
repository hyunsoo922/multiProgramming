package chap02;

import java.util.Scanner;

public class ProgrammingTask08 {
    public static void main(String[] args) {
        int num,a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        num = in.nextInt();

        a = num / 100;
        num = num - a * 100;
        b = num / 10;
        num = num - b * 10;
        c = num / 1;

        System.out.printf("각 자릿수의 합 = %d",a+b+c);

    }
}
