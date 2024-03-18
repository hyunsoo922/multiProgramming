package chap02;

import java.util.Scanner;

public class ProgrammingTask09 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.printf("전공 이수 학점 :");
        a = in.nextInt();
        System.out.printf("교양 이수 학점 :");
        b = in.nextInt();
        System.out.printf("일반 이수 학점 :");
        c = in.nextInt();

        System.out.println((a >= 70) && (( b >= 30 && c >= 30) || b+c >=80 ) && (a+b+c >=140) ? "졸업 가능" : "졸업 불가");



    }
}
