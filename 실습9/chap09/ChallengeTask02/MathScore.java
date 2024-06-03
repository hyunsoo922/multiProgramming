package chap09.ChallengeTask02;

import chap09.ChallengeTask01.EnglishScore;

public class MathScore implements Comparable<MathScore> {

    String name;
    int score;

    public MathScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString()
    {
        return name+", "+score;
    }


    @Override
    public int compareTo(MathScore o) {
        if(score > o.score)
        {
            return score;
        }
        else{
            return o.score;
        }
    }
}
