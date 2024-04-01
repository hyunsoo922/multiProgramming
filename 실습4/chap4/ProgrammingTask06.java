package chap04;

class Complex{
    double num;
    String i;

    public Complex(double num) {
        this.num = num;
        i = "0.0i";
    }

    public Complex(double num, double i) {
        this.num = num;
        this.i = i+"i";
    }

    public void print()
    {
        System.out.println(num+" + "+i);
    }
}

public class ProgrammingTask06 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();

        Complex c2 = new Complex(1.5,2.5);
        c2.print();
    }
}
