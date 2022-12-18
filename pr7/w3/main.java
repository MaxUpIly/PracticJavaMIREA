package mirea.pr7.w3;

public class main {
    public static void main(String[] args){
        MovableRectangle rectangle_1 = new MovableRectangle(0,0,2,3,3,2);
        MovableRectangle rectangle_2 = new MovableRectangle(2,3,1,5,6,8);
        rectangle_2.MoveUp();
        rectangle_1.print();
        rectangle_2.print();
    }
}