package mirea.pr7.w3;

public class MovableRectangle implements Movable {
    MovablePoint onePoint;
    MovablePoint twoPoint;
    public MovableRectangle(double x1,double y1,double speed1,double x2,double y2,double speed2){
        onePoint = new MovablePoint(x1,y1,speed1);
        twoPoint = new MovablePoint(x2,y2,speed2);
    }
    @Override
    public void MoveUp(){
        onePoint.MoveUp();
        twoPoint.MoveUp();
    }

    @Override
    public void MoveDown() {
        onePoint.MoveDown();
        twoPoint.MoveDown();
    }

    @Override
    public void MoveRight() {
        onePoint.MoveRight();
        twoPoint.MoveRight();
    }

    @Override
    public void MoveLeft() {
        onePoint.MoveLeft();
        twoPoint.MoveLeft();
    }
    public void SpeedTest(){
        if (onePoint.speed == twoPoint.speed){
            System.out.println("Все ок, скорость одинаковая");
        }
        else {System.out.println("Не ок, скорость разная");}
    }
    public void print(){
        System.out.println("Прямоугольник с точками:");
        System.out.println("Первая точка: ");
        System.out.println(onePoint);
        System.out.println("Вторая точка: ");
        System.out.println(twoPoint);
        this.SpeedTest();
    }
}

