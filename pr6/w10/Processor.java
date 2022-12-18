package mirea.pr6.w10;

public class Processor implements Information{
    private String name;
    private int GHz;
    public Processor(String name,int GHz){
        this.name = name;
        this.GHz = GHz;
    }

    public void setName(String name) { this.name=name; }

    public void setСharacter(int power) { GHz = power; }

    @Override
    public String toString() {
        return "Процессор " + name + " c тактовой частотой " + GHz + " GHz";
    }
}
