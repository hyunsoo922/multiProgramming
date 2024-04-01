package chap04;

class Dice{
    public int roll(){
        int number = (int)(Math.random()*6)+1;
        return number;
    }
}

public class ProgrammingTask08 {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : "+d.roll());
    }
}
