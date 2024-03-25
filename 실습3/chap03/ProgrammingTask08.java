package chap03;

public class ProgrammingTask08 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int n)
    {
        int result = 1;

        switch (n)
        {
            case 1 -> result = 1;
            case 2 -> result = 2;
            case 3 -> result = 6;
            case 4 -> result = 24;
            case 5 -> result = 120;
        }


        return result;
    }

}
