package chap09.ProgrammingTask07;

public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>();
        i.set(new Integer(100));
        System.out.println(i.get());

        Box<String> s = new Box<>();
        s.set("만능이네!");
        System.out.println(s.get());
    }
}
