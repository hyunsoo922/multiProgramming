package chap05;

public class ProgrammingTask02 {
    public static void main(String[] args) {
        System.out.println(sumExceptFirst(1,2,3,4));
        int arr[] = {2,3};
        System.out.println(sumExceptFirst(1,arr));
        System.out.println(sumExceptFirst(1,2,3,4,5));
    }

    public static int sumExceptFirst(int... a)
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(i != 0)
            {
                sum+=a[i];
            }
        }
        return sum;
    }

    public static int sumExceptFirst(int a, int[] b)
    {
        int sum = 0;
        for(int i = 0 ; i < b.length; i++)
        {
            sum+=b[i];
        }
        return sum;
    }
}
