package mirea.pr6.w1;

class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x,int y, int xSpeed,int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Координаты точки: x= " + x +" y= " + y;
    }
    public void moveUp() { y+=ySpeed; }
    public void moveDown() { y-=ySpeed; }
    public void moveLeft() { x-=xSpeed; }
    public void moveRight() { x+=xSpeed; }
}
class MovableCircle extends MovablePoint{
    public MovableCircle(int x,int y, int xSpeed,int ySpeed){
        super(x, y, xSpeed, ySpeed);
    }
    int radius = 3;
    @Override
    public String toString() {
        return "Координаты круга: x= " + x +" y= " + y + " Радиус: " + radius;
    }
}
public class work_1 {
    public static void main(String[] args){
        MovablePoint point = new MovablePoint(0,0,1,1);
        point.moveUp();
        point.moveRight();
        System.out.println(point);
        MovableCircle circle = new MovableCircle(0,0,2,3);
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle);
    }
}
