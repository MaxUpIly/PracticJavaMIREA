package mirea.pr2;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Maksim Gor", "bookandme@mail.ru", 'M');
        Author a2 = new Author("Peace War", "abcd123@yandex.ru", 'X');
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("NAME: " + a1.getName());
        System.out.println("EMAIL: " + a1.getEmail());
        System.out.println("GENDER: " + a1.getGender());
        a1.setEmail("1989.maks@gmail.com");
        System.out.println(a1);
    }
}
