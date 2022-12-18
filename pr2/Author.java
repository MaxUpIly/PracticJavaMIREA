package mirea.pr2;
import java.lang.*;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name,String email,char gender){
        this.name = name;
        this.email = email;
        if (gender != 'M' && gender != 'F') {
            System.out.println("Не правильно указан пол! Присваивается неизвестный у " + name);
            this.gender = 'U';
            return;
        }
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String toString(){
        return "Author - " + name + " (" + gender + ") at " + email;
    }
}
