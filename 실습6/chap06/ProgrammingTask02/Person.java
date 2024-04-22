package chap06.ProgrammingTask02;

public class Person {
    String name;
    int age;

    public void show()
    {
        System.out.println("사람[이름 : "+name+", 나이 : "+age+"]");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
