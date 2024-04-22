package chap06.ProgrammingTask05;

public class Telephone extends Phone{
    private String when;

    @Override
    void autoAnswering()
    {
        System.out.println(owner+"가 없다. 내일 전화 줄래.");
    }

    public Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }
}
