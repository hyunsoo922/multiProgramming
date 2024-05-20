package chap07.ProgrammingTask03;

public class Book implements Comparable<Book> {
    int price;

    public Book(int price) {
        this.price = price;
    }

    public void print()
    {
        System.out.println("Book [price="+price+"]");
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.price,o.price);
    }
}
