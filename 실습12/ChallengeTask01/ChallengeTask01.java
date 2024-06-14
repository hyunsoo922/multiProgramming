package chap12.ChallengeTask01;

import java.util.List;
import java.util.Optional;

public class ChallengeTask01 {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");

        System.out.println(
                names.stream()
                        .filter(name -> name.compareTo("이") < 0)
                        .reduce((a, b) -> a + " " + b)
                        .orElse("")
        );

        names.stream()
                .sorted()
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        Optional<String> firstName = names.stream().findFirst();
        System.out.println(firstName);

        firstName.ifPresent(System.out::println);

        long count = names.stream().count();
        System.out.println(count);
    }
}
