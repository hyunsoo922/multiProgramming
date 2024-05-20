package chap07.ProgrammingTask08;

import java.util.Scanner;

public class EchoerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Echoer e = new Echo();

        e.start();
        e.echo();
        e.stop();
    }
}
