package chap12.ProgrammingTask03;

import java.util.stream.IntStream;

public class ProgrammingTask03 {
    public static void main(String[] args) {
        String result = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> "A" + i)
                .reduce((s1, s2) -> s1 + " " + s2)
                .orElse("");

        System.out.println(result);
    }
}
