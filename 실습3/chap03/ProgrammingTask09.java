package chap03;

public class ProgrammingTask09 {
    public static void main(String[] args) {
        foo("안녕",1);
        foo("안녕하세요",1,2);
        foo("잘 있어");
    }

    public static void foo(String s)
    {
        System.out.printf("%s\n",s);
    }
    public static void foo(String s,int a)
    {
        System.out.printf("%s %d\n",s,a);
    }
    public static void foo(String s,int a,int b)
    {
        System.out.printf("%s %d %d\n",s,a,b);
    }

}
