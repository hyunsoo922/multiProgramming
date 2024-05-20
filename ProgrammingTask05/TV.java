package chap07.ProgrammingTask05;

public class TV extends Controller{


    public TV(boolean power) {
        super(power);
    }

    @Override
    String getName() {
        return "TV";
    }



    @Override
    void show() {
        if(power)
        {
            System.out.println("TV가 켜졌습니다.");
        }
        else{
            System.out.println("TV가 꺼졌습니다.");
        }
    }
}
