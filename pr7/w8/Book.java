package mirea.pr7.w8;

class Book implements Printable {
    String name = "";
    public Book(String name){
        this.name = name;
    }
    public Book(){
        this.name = "NoName";
    }
    public void print(){
        System.out.print(name + " ");
    }
}
