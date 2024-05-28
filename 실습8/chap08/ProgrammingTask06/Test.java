package chap08.ProgrammingTask06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss");
        SimpleDateFormat sf2 = new SimpleDateFormat("오늘은 M월의 dd번째 날");
        SimpleDateFormat sf3 = new SimpleDateFormat("오늘은 yyyy년의 D번째 날");
        Date date = new Date();

        String s = sf1.format(date);
        System.out.println(s);
        s = sf2.format(date);
        System.out.println(s);
        s = sf3.format(date);
        System.out.println(s);
    }
}
