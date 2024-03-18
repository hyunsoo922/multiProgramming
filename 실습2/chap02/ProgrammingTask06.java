package chap02;

import java.util.Scanner;

public class ProgrammingTask06 {
    public static void main(String[] args) {
        double c,f;
        System.out.print("화씨온도를 입력하세요: ");
        Scanner in = new Scanner(System.in);
        f = in.nextDouble();

        c = (double) 5 / 9 *(f-32);
        System.out.printf("섭씨온도는 %.1f 입니다.",c);


    }
}
