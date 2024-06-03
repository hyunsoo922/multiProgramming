package chap09.ChallengeTask03;

import chap09.ChallengeTask01.EnglishScore;
import chap09.ChallengeTask02.MathScore;

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
    static <T> T findScore(T[] a, String name)
    {
        for(T t : a)
        {
            if(t.toString().substring(0,3).equals(name))
            {
                return t;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        EnglishScore[] ea = {new EnglishScore("김삿갓",77), new EnglishScore("장영실",88),new EnglishScore("홍길동",99)};
        chap09.ChallengeTask02.MathScore[] ma = {new chap09.ChallengeTask02.MathScore("김삿갓",80), new chap09.ChallengeTask02.MathScore("장영실",98),new MathScore("홍길동",70)};
        String name = null;

        System.out.println("영어 최고 점수 : "+findBest(ea));
        System.out.println("수학 최고 점수 : "+findBest(ma));


        try {
            if(args.length == 0)
            {
                throw new IllegalArgumentException("명령행 인자가 없습니다.");
            }else{
                System.out.println("영어      점수 :"+findScore(ea,name));
                System.out.println("수학      점수 :"+findScore(ma,name));
            }
        }catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }



    }
}
