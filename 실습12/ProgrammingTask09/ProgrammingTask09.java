package chap12.ProgrammingTask09;

import java.util.stream.IntStream;

public class ProgrammingTask09 {
    public static void main(String[] args) {
        int n = 5;
        IntStream.range(1, n + 1).forEach(i -> {
            int[] triplet = generatePythagoreanTriplet(i);
            System.out.printf("(%d,%d,%d) ", triplet[0], triplet[1], triplet[2]);
        });
    }

    private static int[] generatePythagoreanTriplet(int i) {
        switch (i) {
            case 1:
                return new int[]{3, 4, 5};
            case 2:
                return new int[]{5, 12, 13};
            case 3:
                return new int[]{6, 8, 10};
            case 4:
                return new int[]{7, 24, 25};
            case 5:
                return new int[]{8, 15, 17};
            default:
                throw new IllegalArgumentException("해당하는 집합이 없습니다.");
        }
    }
}
