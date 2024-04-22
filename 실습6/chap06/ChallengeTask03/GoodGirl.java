package chap06.ChallengeTask03;


public class GoodGirl extends Girl {

    @Override
    void show() {
        System.out.println(name+"는 자바를 잘 안다.");
    }

    public GoodGirl(String name) {
        super(name);
    }
}
