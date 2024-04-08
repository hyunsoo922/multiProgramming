package chap05;

public class ProgrammingTask06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] reverseArr = reverse(arr);

        for(int i = 0 ; i < reverseArr.length; i++)
        {
            System.out.print(reverseArr[i]+" ");
        }
    }

    public static int[] reverse(int[] org)
    {
        int[] arr = new int[org.length];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = org[arr.length - 1 -i];
        }

        return arr;
    }
}
