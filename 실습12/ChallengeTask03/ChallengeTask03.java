package chap12.ChallengeTask03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChallengeTask03 {
    public static int index = 0;

    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Member.Gender> genders = Arrays.asList(Member.Gender.남, Member.Gender.여, Member.Gender.남, Member.Gender.남, Member.Gender.남, Member.Gender.여);
        List<Integer> ages = Arrays.asList(25, 20, 29, 28, 32, 18);

        List<Member> members = names.stream()
                .map(name -> new Member(name, genders.get(index), ages.get(index++)))
                .collect(Collectors.toList());

        System.out.println("[Member 스트림 원소]");
        members.forEach(System.out::print);

        Map<Member.Gender, List<Member>> groupedByGender = members.stream()
                .collect(Collectors.groupingBy(Member::getGender));

        System.out.println("\n[Member 스트림을 성별로 그룹핑]");
        System.out.println(groupedByGender);
    }
}
