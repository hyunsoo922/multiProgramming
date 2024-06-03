package chap09.ChallengeTask02;

import chap09.ChallengeTask01.EnglishScore;

public class MathTest {
    static <T extends Comparable<T>> T findBest(T[] a)
    {
        T best = a[0];
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
        MathScore[] ma = {new MathScore("김삿갓",80), new MathScore("장영실",98),new MathScore("홍길동",70)};

    }
}
