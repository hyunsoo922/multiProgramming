package chap12.ProgrammingTask08;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProgrammingTask08 {
    public static void main(String[] args) {
        List<Nation> nations = Arrays.asList(
                new Nation("ROK", "LAND", "선진국"),
                new Nation("USA", "LAND", "선진국"),
                new Nation("China", "LAND", "선진국"),
                new Nation("Morocco", "LAND", "개도국"),
                new Nation("United Kingdom", "ISLAND", "선진국"),
                new Nation("New Zealand", "ISLAND", "개도국"),
                new Nation("Philiphine", "ISLAND", "개도국"),
                new Nation("Sri Lanka", "ISLAND", "개도국")
        );

        // Grouping by type (LAND or ISLAND) and then by classification (선진국 or 개도국)
        Map<String, Map<String, List<Nation>>> map = nations.stream()
                .collect(Collectors.groupingBy(
                        Nation::getType,
                        Collectors.groupingBy(Nation::getNation)
                ));

        // Print the result
        System.out.println(map);
    }
}
