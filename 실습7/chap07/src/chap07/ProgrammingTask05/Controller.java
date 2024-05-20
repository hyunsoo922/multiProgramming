package chap07.ProgrammingTask05;

public abstract class Controller {
    boolean power;
    void show()
    {

    }

    public Controller(boolean power) {
        this.power = power;
    }

    abstract String getName();
}
