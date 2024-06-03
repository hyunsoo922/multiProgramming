package chap09.ProgrammingTask02;

class Shape {}

class Rectangle extends Shape{}

class Circle extends Shape{}

public class CastExceptionTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        try {
            casting(r);
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }
    static void casting(Shape s)
    {
        Circle c = (Circle) s;
    }
}
