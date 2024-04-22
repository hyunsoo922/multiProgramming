package chap06.ProgrammingTask03;

public class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString()
    {
        String location = "좌표("+x+","+y+")";
        return location;
    }
}
