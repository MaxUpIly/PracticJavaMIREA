package mirea.pr7.w4;

public class MathFunc implements MathCalculable{
    public double Circumference(double r){
        return r * 2 * MathCalculable.PI();
    }
}
