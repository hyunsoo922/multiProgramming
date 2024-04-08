package chap05;

import java.util.Scanner;

public class ProgrammingTask05 {
    public static void main(String[] args) {
        System.out.println("숫자를 10개 입력하세요>");
        Scanner in = new Scanner(System.in);
        String[] number = new String[10];
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++)
        {
            arr[i] = in.nextInt();
            number[i] = "";
        }

        for(int i = 0 ; i < 10; i++)
        {
            if(arr[i] >= 90 && arr[i] <100)
            {
                number[9] += "*";
            }else if(arr[i] >= 80)
            {
                number[8] += "*";
            }else if(arr[i] >= 70)
            {
                number[7] += "*";
            }else if(arr[i] >= 60)
            {
                number[6] += "*";
            }else if(arr[i] >= 50)
            {
                number[5] += "*";
            }else if(arr[i] >= 40)
            {
                number[4] += "*";
            }else if(arr[i] >= 30)
            {
                number[3] += "*";
            }else if(arr[i] >= 20)
            {
                number[2] += "*";
            }else if(arr[i] >= 10)
            {
                number[1] += "*";
            }else if(arr[i] >= 0)
            {
                number[0] += "*";
            }

        }

        System.out.println("0 ~ 9 : "+number[0]);
        System.out.println("10 ~ 19 : "+number[1]);
        System.out.println("20 ~ 29 : "+number[2]);
        System.out.println("30 ~ 39 : "+number[3]);
        System.out.println("40 ~ 49 : "+number[4]);
        System.out.println("50 ~ 59 : "+number[5]);
        System.out.println("60 ~ 69 : "+number[6]);
        System.out.println("70 ~ 79 : "+number[7]);
        System.out.println("80 ~ 89 : "+number[8]);
        System.out.println("90 ~ 99 : "+number[9]);

    }
}
