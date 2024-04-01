package chap04;

class GolfClub{
    String num;

    public GolfClub() {
        num = "7번 아이언";
    }

    public GolfClub(int num) {
        this.num = num+"번 아이언";
    }

    public GolfClub(String num) {
        this.num = num;
    }

    public void print()
    {
        System.out.println(num+"입니다.");
    }
}

public class ProgrammingTask07 {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("피터");
        g3.print();
    }
}
