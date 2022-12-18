package mirea.pr6.w10;

public class Monitor implements Information{
    private String name;
    private int diagonal;
    public Monitor(String name, int diagonal){
        this.name = name;
        this.diagonal = diagonal;
    }

    public void setName(String name) { this.name=name; }

    public void setСharacter(int diagonal) { this.diagonal = diagonal; }

    @Override
    public String toString() {
        return "Монитор " + name + " с диагональю " + diagonal + " дюйм";
    }
}
