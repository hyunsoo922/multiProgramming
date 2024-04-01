package chap04;

class Printer{
    private int numOfPapers;
    private boolean duplex;

    public Printer(int numOfPapers, boolean duplex) {
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    public void print(int amount)
    {
        if(duplex)
        {
            double paper = amount / (double) 2;
            double slice = paper - (int) paper;
            int result = 0;
            if(slice != 0)
            {
                result = (int)paper+1;
            }
            int leftPaper = numOfPapers - result;
            System.out.println("양면으로 "+result+"장 출력했습니다."+" 현재 "+leftPaper+"장 남아 있습니다.");
            numOfPapers -= result;
        }else{
            if(numOfPapers < amount)
            {
                int paper = amount - numOfPapers;
                int result = amount - paper;
                System.out.println("단면으로 모두 출력하려면 용지가 "+paper+"매 부족합니다. "+result+"장만 출력합니다.");
            }
        }
    }

    public boolean getDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
public class ChallengeTask03 {
    public static void main(String[] args) {
        Printer p = new Printer(20,true);
        p.print(25);
        p.setDuplex(false);
        p.print(10);
    }
}
