package chap08.ProgrammingTask07;

import java.text.MessageFormat;

public class MessageFormatTest {
    public static void main(String[] args) {
        Object[][] data = {{"세종대왕",1,"조선"},{"오바마",2,"미국"},{"징기스칸",3,"몽고"}};

        String pattern = "이름 : {0}\t번호 : {1}\t국적 : {2}";

        for (Object[] obj : data) {
            String format = MessageFormat.format(pattern, obj);
            System.out.println(format);
        }
    }
}
