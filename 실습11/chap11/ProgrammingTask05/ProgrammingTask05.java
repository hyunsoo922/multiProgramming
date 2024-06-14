package chap11.ProgrammingTask05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgrammingTask05 {
    public static void main(String[] args) {
        List<Integer> grade = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int max = 0;
        while (true)
        {
            System.out.print("점수를 입력하세요: ");
            int score = in.nextInt();
            if(score<0 )
            {
                break;
            }
            else
            {
                grade.add(score);
            }
        }
        System.out.println("전체 학생은 "+grade.size()+"명입니다.");
        System.out.print("학생들의 성적 :");

        for(int i =0; i < grade.size(); i++)
        {
            if(max < grade.get(i)) max = grade.get(i);

            System.out.print(grade.get(i)+" ");
        }
        System.out.println();
        for (int i = 0 ; i < grade.size(); i++)
        {
            String g = "";
            if(grade.get(i) >= max-10)
            {
                g = "A";
            }else if(grade.get(i) >= max-20)
            {
                g = "B";
            }else
            {
                g = "C";
            }
            System.out.println(i+"번 학생의 성적은 "+grade.get(i)+"점이며 등급은 "+g+"이다.");
        }

    }
}
