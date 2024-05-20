package chap07.ChallengeTask03;

public abstract class Countable {

    protected String name;
    protected int num;

    public Countable(String name, int num) {
        this.name = name;
        this.num = num;
    }

    abstract void count();
}