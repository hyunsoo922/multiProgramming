package chap06.ProgrammingTask03;

public class MovablePoint extends Point {
    private int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        String location = super.toString();
        String speed = "\n이동 속도("+xSpeed+","+ySpeed+")";
        String result = location.concat(speed);
        return result;
    }
}
