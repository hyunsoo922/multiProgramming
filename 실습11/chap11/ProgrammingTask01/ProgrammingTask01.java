package chap11.ProgrammingTask01;

import java.util.ArrayList;
import java.util.List;

public class ProgrammingTask01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("갈매기");
        list.add("나비");
        list.add("다람쥐");
        list.add("라마");

        list.forEach(x -> {
            if(x.length() == 2)
                System.out.print(x+" ");
        } );


    }
}
