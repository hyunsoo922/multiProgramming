package chap11.ChallengeTask01;

import java.util.ArrayList;
import java.util.List;

public class ChallengeTask01 {
    public static void main(String[] args) {
        List<String> capitals = new ArrayList<>();
        capitals.add("서울");
        capitals.add("워싱턴");
        capitals.add("베이징");
        capitals.add("파리");
        capitals.add("마드리드");

        capitals.forEach((s)-> System.out.print(s+" "));
        System.out.println();

        capitals.add("런던");
        capitals.forEach((s)-> System.out.print(s+" "));
        System.out.println();

        for(int i=0;i<capitals.size();i++)
        {
            if(capitals.get(i).length() > 2)
            {
                capitals.remove(i);
            }
        }
        capitals.forEach((s)-> System.out.print(s+" "));

    }
}
