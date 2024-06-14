package chap12.ProgrammingTask01;

import java.util.Arrays;
import java.util.List;

public class ProgrammingTask01 {
    public static void main(String[] args) {
        List<String> animal = Arrays.asList("갈매기", "나비", "다람쥐", "라마");

        animal.stream()
                .filter(word -> word.length() == 2)
                .forEach(System.out::println);
    }
}
