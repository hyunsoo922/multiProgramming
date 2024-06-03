package chap09.ProgrammingTask01;

public class NullPointerExceptionTest {
    public static void main(String[] args) {
        MyDate d = new MyDate();

        d.year = 2035;
        d.month = 12;
        d.day = 25;

        System.out.printf("%d년 %d월 %d일\n",d.year,d.month,d.day);
    }
}
