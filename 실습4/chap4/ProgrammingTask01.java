package chap04;

class Triangle{

    private double line;
    private double height;

    public Triangle(double line, double height) {
        this.line = line;
        this.height = height;
    }

    public double findArea()
    {
        return (line * height)/2;
    }
}

public class ProgrammingTask01 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10.0,5.0);
        System.out.println(t.findArea());
    }
}
