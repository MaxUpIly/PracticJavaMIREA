package mirea.pr1;
import java.lang.*;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("Naruto");
        Book b3 = new Book("War and Peace",1867);
        b2.setYear(2002);
        System.out.println(b1);
        b1.ageBook();
        b2.ageBook();
        b3.ageBook();
    }
}
