package chap03;

import java.util.Scanner;

public class ProgrammingTask07 {
    public static void main(String[] args) {
        String c = input("철수");
        String y = input("영희");
        whosWin(c,y);
    }

    public static String input(String x)
    {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s :",x);
        x = in.next();
        return x;
    }

    public static void whosWin(String c, String y)
    {
        if(c.equals(y))
        {
            System.out.println("무승부");
        }else{

            if(c.equals("r") && y.equals("s"))
            {
                System.out.printf("철수, 승!");
            }else if(c.equals("r") && y.equals("p"))
            {
                System.out.println("영희, 승!");
            } else if (c.equals("s") && y.equals("r")) {
                System.out.println("영희, 승!");
            } else if (c.equals("s") && y.equals("p"))
            {
                System.out.println("철수, 승!");
            }else if(c.equals("p") && y.equals("r"))
            {
                System.out.println("철수, 승!");
            }else if(c.equals("p") && y.equals("s"))
            {
                System.out.println("영희, 승!");
            }

        }
    }


}
