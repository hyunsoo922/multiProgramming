package chap12.ProgrammingTask04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProgrammingTask04 {
    public static void main(String[] args) {
        List<String> allNations = Nations.nations;

        String result = allNations.stream()
                .filter(country -> isLand(country))
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    private static boolean isLand(String country) {
        List<String> land = Arrays.asList("Canada", "Mexico", "Brazil");
        return land.contains(country);
    }
}
class Nations {
    static List<String> nations = Arrays.asList(
            "USA", "Canada", "Mexico", "Argentina", "Brazil", "Chile",
            "India", "China", "Japan", "South Korea", "Australia"
    );
}
