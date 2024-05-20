package chap07.ProgrammingTask08;

public class Echo extends Echoer {
    @Override
    void echo() {
        System.out.println("잘 가세요.");
    }

    @Override
    void start() {
        super.start();
        System.out.println("좋은 아침");
    }

    @Override
    void stop() {
        System.out.println("끝");
        super.stop();
    }
}
