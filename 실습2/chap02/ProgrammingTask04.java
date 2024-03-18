package chap02;

import java.util.Scanner;

public class ProgrammingTask04 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("초 단위 정수를 입력하세요 : ");
        num = in.nextInt();
        int hour = num / 3600;
        int minute = num / 60;
        int second = num - (hour * 3600 + minute * 60);

        System.out.printf("%d시간 %d분 %d초",hour,minute,second);
    }
}
