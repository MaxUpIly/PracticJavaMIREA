package mirea.pr7.w8;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        Book book_1 = new Book("Mouse");
        Book book_2 = new Book("Spider-man");
        Book book_3 = new Book();
        Journal journal = new Journal("Lego");
        Journal journal_2 = new Journal();
        Shop shop = new Shop("Labirint");
        shop.getBook(book_1);
        shop.getBook(book_2);
        shop.getBook(book_3);
        shop.getBook(journal);
        shop.getBook(journal_2);
        shop.print();
        System.out.println();
        ArrayList<Printable> list = shop.GetList();
        shop.printJournal(list);
    }
}
