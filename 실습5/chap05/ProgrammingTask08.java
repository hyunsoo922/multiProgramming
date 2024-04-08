package chap05;

import java.util.Scanner;

public class ProgrammingTask08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        switch(s)
        {
            case "monday", "MONDAY" -> System.out.println("월요일은 싫다.");
            case "tuesday","TUESDAY" -> System.out.println("화요일은 그저 그렇다");
            case "wednesday","WEDNESDAY" -> System.out.println("수요일은 그저 그렇다");
            case "thursday","THURSDAY" -> System.out.println("목요일은 그저 그렇다");
            case "friday","FRIDAY" -> System.out.println("금요일은 좋다");
            case "saturday","SATURDAY" -> System.out.println("토요일은 최고");
            case "sunday","SUNDAY" -> System.out.println("일요일은 최고");
        }
    }
}

enum DAY{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}