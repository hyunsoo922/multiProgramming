package chap09.ChallengeTask01;

public class EnglishTest {
    static EnglishScore findBest(EnglishScore[] a)
    {
        EnglishScore best = a[0];
        int maxScore = 0;
        for(int i = 1; i < a.length; i++)
        {
            if(maxScore < best.compareTo(a[i]))
            {
                maxScore = best.compareTo(a[i]);
                best = a[i];
            }
        }
        return best;
    }

    public static void main(String[] args) {
        EnglishScore[] ea = {new EnglishScore("김삿갓",77), new EnglishScore("장영실",88),new EnglishScore("홍길동",99)};

        System.out.println("영어 최고 점수 : "+findBest(ea));
    }
}
