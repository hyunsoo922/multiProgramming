package chap06.ProgrammingTask03;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(50,20);
        Point p2 = new MovablePoint(50,20,40,40);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
