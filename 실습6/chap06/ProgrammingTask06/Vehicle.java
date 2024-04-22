package chap06.ProgrammingTask06;

public class Vehicle {
    String color;
    int speed;

    void show()
    {
        System.out.println("자동차 색상 "+color+"속도 "+speed);
    }

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
}
