package mirea.pr7.w8;

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
        for(Printable x:list) {
            x.print();
        }
    }
    public void printJournal(ArrayList<Printable> material){
        System.out.println("В магазине " + name + " имеются данные журналы:");
        for(Printable x:material){
            if (x instanceof Journal){
                x.print();
            }
        }
    }
    public ArrayList<Printable> GetList(){
        return list;
    }
}
