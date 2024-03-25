package chap03;

import java.util.Scanner;

public class ProgrammingTask03 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        int sum = 0;
        do{
            System.out.print("양의 정수를 입력하세요: ");
            n = in.nextInt();
            if(n % 2 == 0)
            {
                sum += n;
            }

        }while(n > 0);
        System.out.printf("입력한 양의 정수 중에서 짝수의 합은 %d",sum);
    }
}
