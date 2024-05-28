package chap08.ProgrammingTask08;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
    public static void main(String[] args) {
        String sentence = "Empty vessels make the most sound.";
        System.out.println("입력 : "+sentence);

        StringTokenizer token = new StringTokenizer(sentence);
        String[] words = new String[token.countTokens()];
        int index = 0;
        while (token.hasMoreTokens()) {
            words[index] = token.nextToken();
            index++;
        }

        System.out.println("단어 개수: " + words.length);

        Arrays.sort(words);
        System.out.print("정렬된 토큰: ");
        for (String word : words) {
            System.out.print(word + ", ");
        }
    }
}
