package chap06.ProgrammingTask05;

public class Smartphone extends Telephone{
    private String game;

    @Override
    void playGame()
    {
        System.out.println(owner+"가 "+game+" 게임을 하는 중이다.");
    }

    public Smartphone(String owner, String game) {
        super(owner, "");
        this.game = game;
    }
}
