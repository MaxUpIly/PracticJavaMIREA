package mirea.pr5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

abstract class Shape{
    protected int x = 0;
    protected int y = 0;
    protected Color color;
    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX() { return x;}
    public int getY() {return y;}
    public void setColor(Color color) {this.color = color;}
    public Color getColor(){return color;}
}
class Round extends Shape{
    private double radius = 1;
    public Round(){}
    public void setRadius(double radius) {this.radius = radius;}
    public double getRadius() {return radius;}
}
class Square extends Shape{
    private int width = 100;
    public Square(){}
    public Square(int width) {this.width = width;}
    public void setWidth(int width) {this.width = width;}
    public int getWidth() {return width;}
}

public class work_2 extends JFrame {
    public static Shape getRandomShape()
    {
        Random rand = new Random();
        int rand_int = rand.nextInt(2);
        switch (rand_int)
        {
            case 0:
            {
                return new Round();
            }
            default:
            {
                return new Square();
            }
        }
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        for (int i = 50; i < 800; i = i + 200)
        {
            for (int j = 50; j < 1250; j = j + 250) {
                Shape sh = getRandomShape();
                sh.setXY(j, i);
                int re = (int) (Math.random() * 255);
                int gr = (int) (Math.random() * 255);
                int bl = (int) (Math.random() * 255);
                sh.setColor(new Color(re, gr, bl));

                g.setColor(sh.getColor());
                if (sh.getClass().getSimpleName().equals("Square")) {
                    g.fillRect(sh.getX(), sh.getY(), 150, 150);}
                else {
                    g.fillOval(sh.getX(), sh.getY(), 150, 150);
                }
            }
        }
    }
    public work_2()
    {
        super("Shape");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1300,850);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new work_2();
    }
}
