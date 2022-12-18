package mirea.pr1;
import java.lang.*;

public class Book {
    private String name;
    private int year;
    public Book() {
        name = "No name";
        year = 0;
    }
    public Book(String name){
        this.name = name;
        this.year = 0;
    }
    public Book(String name,int year){
        this.name = name;
        this.year = year;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public String toString(){
        return "Name book " + this.name + " from " + this.year;
    }
    public void ageBook(){
        System.out.println("The book " + name + " is already " + (2022-year) + " years old");
    }
}
