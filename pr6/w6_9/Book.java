package mirea.pr6.w6_9;

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
