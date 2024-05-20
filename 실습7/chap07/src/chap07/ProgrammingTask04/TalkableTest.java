package chap07.ProgrammingTask04;

public class TalkableTest {
    static void speak(Talkable talk)
    {
        talk.talk();
    }

    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}
