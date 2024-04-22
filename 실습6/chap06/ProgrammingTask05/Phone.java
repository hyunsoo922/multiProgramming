package chap06.ProgrammingTask05;

public class Phone {
    protected String owner;

    void talk()
    {
        System.out.println(owner+"가 통화 중 이다.");
    }

    void autoAnswering()
    {

    }

    void playGame()
    {

    }


    public Phone(String owner) {
        this.owner = owner;
    }
}
