package chap03;

import java.util.Scanner;

public class ProgrammingTask01 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        if(n >= 19)
        {
            System.out.println("성년");
        }else{
            System.out.println("미성년");
        }
    }
}
