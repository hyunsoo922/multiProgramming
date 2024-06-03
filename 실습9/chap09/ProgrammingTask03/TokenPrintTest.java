package chap09.ProgrammingTask03;

import java.util.NoSuchElementException;

public class TokenPrintTest {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";
        try {
            showTokens(s,", ");
        }catch (NoSuchElementException e)
        {
            System.out.println("끝");
        }
    }

    static void showTokens(String s, String cut)
    {
        String[] strings = s.split("[ ,]+");

        int index = 0;
        while (true) {
            if (index >= strings.length) {
                break; 
            }
            System.out.println(strings[index]);
            index++;
        }
    }
}
