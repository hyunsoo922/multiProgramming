package chap05;

import java.util.Scanner;

public class ChallengeTask03 {
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        numOfStudents = in.nextInt();

        scores = new int[numOfStudents];

        System.out.println(numOfStudents+"명의 학생 성적을 입력하세요.");
        for(int i = 0 ; i < numOfStudents; i++)
        {
            scores[i] += in.nextInt();
        }

        System.out.println(numOfStudents+"명의 학생 성적은 다음과 같습니다.");
        for(int score : scores)
        {
            System.out.print(score+" ");
        }

        System.out.println();

        for(int i = 0 ; i < numOfStudents; i++)
        {
            if(scores[i] >= 90)
            {
                System.out.println(i+1+"번 학생의 등급은 "+ Grade.A+"입니다.");
            }else if(scores[i] >= 80)
            {
                System.out.println(i+1+"번 학생의 등급은 "+ Grade.B+"입니다.");
            }else if(scores[i] >= 70)
            {
                System.out.println(i+1+"번 학생의 등급은 "+ Grade.C+"입니다.");
            }else if(scores[i] >= 60)
            {
                System.out.println(i+1+"번 학생의 등급은 "+ Grade.D+"입니다.");
            }else {
                System.out.println(i+1+"번 학생의 등급은 "+ Grade.E+"입니다.");
            }
        }


    }
}

enum Grade{
    A("최우수"), B("우수"), C("보통"), D("미흡"), E("탈락");

    private String s ;
    Grade(String s) {
        this.s = s;
    }

    public String toString(){
        return s;
    }
}