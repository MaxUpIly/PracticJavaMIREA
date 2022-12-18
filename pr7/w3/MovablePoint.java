package mirea.pr7.w3;

public class MovablePoint implements Movable{
    double x;
    double y;
    double speed;
    public MovablePoint(double x,double y,double speed){
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void MoveUp() { y+=speed; }

    @Override
    public void MoveDown() { y-=speed; }

    @Override
    public void MoveLeft() { x-=speed; }

    @Override
    public void MoveRight() { x+=speed;}

    @Override
    public String toString() {
        return "Координаты: x = " + x + " y = " + y + " Скорость перемещения: " + speed;
    }
    public double GetSpeed(){ return speed;}
}
