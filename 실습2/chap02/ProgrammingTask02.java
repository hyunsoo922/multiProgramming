package chap02;

import java.util.Scanner;

public class ProgrammingTask02 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        num = in.nextInt();
        System.out.printf("%d의 제곱은 %d",num,num * num);

    }
}
