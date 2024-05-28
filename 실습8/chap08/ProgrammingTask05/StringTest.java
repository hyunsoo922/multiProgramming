package chap08.ProgrammingTask05;

import java.util.Date;

public class StringTest {
    public static void main(String[] args) {
        show(new String("멘붕"));
        show(new StringBuilder("meltdown"));
        show(new StringBuffer("!@#"));
        show(new Date());
    }

    static void show(Object s)
    {
        if(s instanceof Date)
            return;
        System.out.println(s);
    }
}
