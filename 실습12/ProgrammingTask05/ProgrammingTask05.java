package chap12.ProgrammingTask05;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgrammingTask05 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        double avg = stream.collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("원소 평균: " + avg);

        stream = Stream.of(1, 2, 3, 4, 5);

        double sAvg = stream.mapToInt(x -> x * x)
                .average()
                .orElse(0.0);
        System.out.println("원소 제곱값 평균: " + sAvg);

        stream = Stream.of(1, 2, 3, 4, 5);

        String hyphen = stream.map(String::valueOf)
                .collect(Collectors.joining("-"));
        System.out.println("원소 하이픈으로 연결한 문자열: " + hyphen);
    }
}
