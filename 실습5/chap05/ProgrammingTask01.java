package chap05;

public class ProgrammingTask01 {
    public static void main(String[] args) {
        int count = countChar("scscvvv",'v');
        System.out.println("c의 개수"+ count);
    }

    public static int countChar(String s, char c)
    {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == c)
            {
                count++;
            }
        }
        return count;
    }
}
