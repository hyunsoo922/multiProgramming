package chap07.ChallengeTask03;

public class Bird extends Countable {
    String name;

    public Bird(String name, int num) {
        super(name, num);
        this.name=name;
    }


    void fly()
    {
        System.out.println(num+"마리"+name+"가 날아간다.");
    }


    @Override
    public void count() {
        System.out.println(name+"가 "+num+"마리가 있다.");
    }
}
