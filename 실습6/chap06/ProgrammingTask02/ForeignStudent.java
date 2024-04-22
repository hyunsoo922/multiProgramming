package chap06.ProgrammingTask02;

public class ForeignStudent extends Student {
    String world;

    @Override
    public void show() {
        System.out.println("외국학생[이름 : "+name+", 나이 : "+age+", 학번 : "+studentNum+", 국적 :"+world+"]");
    }

    public ForeignStudent(String name, int age, String studentNum, String world) {
        super(name, age, studentNum);
        this.world = world;
    }
}
