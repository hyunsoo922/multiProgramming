package chap04;

class Printer {
    private int numOfPapers;

    public Printer(int numOfPapers) {
        this.numOfPapers = numOfPapers;
    }

    public void print(int amount)
    {
        if(numOfPapers <= 0)
        {
            System.out.println("용지가 없습니다.");
        }else if(numOfPapers > amount)
        {
            int paper = numOfPapers - amount;
            System.out.println(amount+"장 출력했습니다. 현재 "+ paper+"장 남아 있습니다.");
            numOfPapers-=amount;
        }else if(numOfPapers < amount){
            int paper = amount - numOfPapers;
            System.out.println("모두 출력하려면 용지가 "+ paper +"매 부족합니다. "+numOfPapers+"장만 출력합니다.");
            numOfPapers = 0;
        }
    }
}
public class ChallengeTask02 {
    public static void main(String[] args) {
        Printer p = new Printer(10);
        p.print(2);
        p.print(20);
        p.print(10);

    }
}
