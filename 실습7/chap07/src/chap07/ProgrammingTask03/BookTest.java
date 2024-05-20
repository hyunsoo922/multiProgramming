package chap07.ProgrammingTask03;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        Book[] bookList = {new Book(15000), new Book(50000), new Book(20000)};
        System.out.println("정렬 전");
        for(Book book: bookList)
        {
            book.print();
        }
        System.out.println("정렬 후");
        Arrays.sort(bookList);
        for(Book book: bookList)
        {
            book.print();
        }
    }
}
