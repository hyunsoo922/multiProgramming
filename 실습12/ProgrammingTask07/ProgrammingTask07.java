package chap12.ProgrammingTask07;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProgrammingTask07 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("민국", "지우", "하준", "지우", "하준", "지우");

        Map<String, Long> map = name.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(map);
    }
}
