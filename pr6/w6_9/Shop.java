package mirea.pr6.w6_9;

import java.util.ArrayList;

class Shop implements Printable {
    String name ="";
    ArrayList<Printable> list = new ArrayList<Printable>(1);
    public Shop(String name){
        this.name = name;
    }
    public Shop(){
        this.name = "NoNameShop";
    }
    public void getBook(Printable book){
        list.add(book);
    }
    public void print(){
        System.out.println("В магазине " + name + " имеются данные материалы:");
        for(Printable x:list){
            x.print();
        }
    }
}
