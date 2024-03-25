package chap03;

public class ProgrammingTask05 {
    public static void main(String[] args) {
        for(int a = 1; a <= 20; a++)
        {
            for(int b = 1; b<=20; b++)
            {
                int d = a * a + b * b;
                int c= 1;
                while (c * c < d)
                {
                    c++;
                }
                if(c * c == d && a+b+c <=20)
                {
                    System.out.printf("각 변의 길이는 %d %d %d 이다.",a,b,c);
                    System.out.println();

                }
            }

        }



    }
}
