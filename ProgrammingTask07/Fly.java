package chap07.ProgrammingTask07;

public class Fly implements Flyable{
    @Override
    public void speed() {
        System.out.println("속도");
    }
    @Override
    public void height() {
        System.out.println("높이");
    }
}
