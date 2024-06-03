package chap09.ChallengeTask03;

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
