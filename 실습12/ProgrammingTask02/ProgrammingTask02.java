package chap12.ProgrammingTask02;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProgrammingTask02 {
    public static void main(String[] args) {
        List<String> landmark = Arrays.asList("서울","워싱턴","베이징","파리","마드리드","런던");

        Optional<String> first =
                landmark.stream()
                    .sorted()
                    .findFirst();

        System.out.println(first);
    }
}
