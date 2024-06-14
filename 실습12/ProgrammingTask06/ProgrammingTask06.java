package chap12.ProgrammingTask06;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgrammingTask06 {
    public static void main(String[] args) {
        List<String> capitals = Arrays.asList("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
        List<Double> populations = Arrays.asList(973.7, 63.2, 2115.0, 224.4, 326.5, 853.9);

        Stream<Population> populationStream =
                capitals.stream()
                        .filter(capital -> populations.get(capitals.indexOf(capital)) > 300.0) // filter by population > 300.0
                        .map(capital -> new Population(capital, populations.get(capitals.indexOf(capital))));

        populationStream.forEach(population -> System.out.println(population.toString()));
    }
}
