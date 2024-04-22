package chap06.ProgrammingTask01;

public class ColoredCircle extends Circle {

    String color;

    @Override
    void show() {
        System.out.println("반지름이 "+radius+"인 "+color+" 원이다.");
    }

    public ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }
}
