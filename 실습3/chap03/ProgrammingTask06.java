package chap03;

import java.util.Scanner;

public class ProgrammingTask06 {
    public static void main(String[] args) {
        String a , b;
        Scanner in = new Scanner(System.in);
        System.out.print("철수 :");
        a = in.next();
        System.out.print("영희 :");
        b = in.next();

        if(a.equals(b))
        {
            System.out.println("무승부");
        }else{

            if(a.equals("r") && b.equals("s"))
            {
                System.out.println("철수, 승!");
            }else if(a.equals("r") && b.equals("p"))
            {
                System.out.println("영희, 승!");
            } else if (a.equals("s") && b.equals("r")) {
                System.out.println("영희, 승!");
            } else if (a.equals("s") && b.equals("p"))
            {
                System.out.println("철수, 승!");
            }else if(a.equals("p") && b.equals("r"))
            {
                System.out.println("철수, 승!");
            }else if(a.equals("p") && b.equals("s"))
            {
                System.out.println("영희, 승!");
            }

        }
    }
}
