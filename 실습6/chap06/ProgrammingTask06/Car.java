package chap06.ProgrammingTask06;

public class Car extends Vehicle{
    int displacement;
    int gears;

    @Override
    void show() {
        super.show();
        System.out.println("배기량 "+displacement+"기어 단수"+gears);
    }

    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }
}
