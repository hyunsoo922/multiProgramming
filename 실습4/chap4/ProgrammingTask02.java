package chap04;

class Triangle{
    private double line;
    private double height;

    public Triangle(double line, double height) {
        this.line = line;
        this.height = height;
    }

    public boolean isSameArea(Triangle t)
    {
        double result = (line*height)/2;
        double youResult = (t.line*t.height)/2;

        if(result == youResult)
        {
            return true;
        }

        return false;
    }

}

public class ProgrammingTask02 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0,5.0);
        Triangle t2 = new Triangle(5.0,10.0);
        Triangle t3 = new Triangle(8.0,8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));

    }
}
