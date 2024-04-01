package chap04;

class Car{
    private String color;
    public static int count = 0;

    public static int redCount = 0;

    public Car(String color) {
        this.color = color;
        count++;
        if(color.equals("RED") || color.equals("red"))
        {
            redCount++;
        }
    }

    public static int getNumOfCar(){
        return count;
    }

    public static int getNumOfRedCar(){
        return redCount;
    }
}

public class ProgrammingTask04 {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",Car.getNumOfCar(),Car.getNumOfRedCar());
    }
}
