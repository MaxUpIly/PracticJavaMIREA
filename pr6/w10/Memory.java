package mirea.pr6.w10;

public class Memory implements Information{
    private String name;
    private int gigabyte;
    public Memory(String name, int gigabyte){
        this.name = name;
        this.gigabyte = gigabyte;
    }
    public void setName(String name) { this.name=name;}

    public void setСharacter(int gigabyte) { this.gigabyte = gigabyte;}

    @Override
    public String toString() {
        return "Оперативная память " + name + " с объемом " + gigabyte + " гиг";
    }
}