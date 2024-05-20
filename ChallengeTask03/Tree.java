package chap07.ChallengeTask03;

public class Tree extends Countable {
    String name;

    public Tree(String name, int num) {
        super(name, num);
        this.name = name;
    }


    void ripen()
    {
        System.out.println(num+"그루 "+name+"에 열매가 잘 익었다.");
    }

    @Override
    public void count() {
        System.out.println(name+"가 "+num+"그루 있다.");
    }
}
