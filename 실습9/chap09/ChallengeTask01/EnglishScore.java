package chap09.ChallengeTask01;

public class EnglishScore implements Comparable<EnglishScore> {
    String name;
    int score;

    public EnglishScore(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString()
    {
        return name+", "+score;
    }

    @Override
    public int compareTo(EnglishScore o) {

        if(score > o.score)
        {
            return score;
        }
        else{
            return o.score;
        }
    }
}
