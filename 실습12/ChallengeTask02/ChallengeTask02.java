package chap12.ChallengeTask02;

import java.util.List;
import java.util.OptionalInt;

public class ChallengeTask02 {
    public static void main(String[] args) {
        List<Integer> ages = List.of(25,20,29,28,32,18);
        List<Gender> genders = List.of(Gender.남,Gender.여,Gender.남,Gender.남,Gender.남,Gender.여);

        int sum = ages.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        List<Integer> agesCopy = List.copyOf(ages);
        OptionalInt max = agesCopy.stream().mapToInt(Integer::intValue).max();
        max.ifPresent(System.out::println);

        double avg = agesCopy.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(avg);
    }
    public enum Gender{남,여}
}
