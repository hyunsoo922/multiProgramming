package chap06.ProgrammingTask02;

public class Student extends Person{
    String studentNum;

    @Override
    public void show() {
        System.out.println("학생[이름 : "+name+", 나이 : "+age+", 학번 : "+studentNum+"]");
    }

    public Student(String name, int age, String studentNum) {
        super(name, age);
        this.studentNum = studentNum;
    }
}
