package chap02;

public class ProgrammingTask05 {
    public static void main(String[] args) {
        char c = 'a';
        int distance = (int)'A'- (int)'a';
        System.out.printf("소문자: %c \n",c);
        System.out.printf("대문자: %c",c+distance);
    }
}
