package chap03;

import java.util.Scanner;

public class ChallengeTask01 {
    public static void main(String[] args)
    {
        int result;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("팩토리얼 값을 구할 정수 :");
        n = in.nextInt();

        result = 1;
        while(n > 0)
        {
            result *= n;
            n--;
        }


        System.out.println(result);
    }
}
