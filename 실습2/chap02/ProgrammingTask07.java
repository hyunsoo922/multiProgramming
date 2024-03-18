package chap02;

import java.util.Scanner;

public class ProgrammingTask07 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        num = in.nextInt();

        boolean b;

        b = num % 4 == 0 && num % 5 ==0 ? true : false;

        System.out.printf("정수 %d가 4와 5로 나누어지는가? ",num);
        System.out.println(b);

        b = num % 4 == 0 || num % 5 == 0 ? true : false;

        System.out.printf("정수 %d가 4또는 5로 나누어지는가? ",num);
        System.out.println(b);

        b = (num % 4 ==0 && num % 5 !=0) || (num % 4 != 0 && num % 5 ==0) ? true : false;
        System.out.printf("정수 %d가 4나 5중 하나로 나누어지는가? ",num);
        System.out.println(b);

    }
}
