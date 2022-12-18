package mirea.pr7.w4;

public class main {
    public static void main(String[] args){
        System.out.println("3^0 = " + MathCalculable.pow(3,0));
        System.out.println("3^3 = " + MathCalculable.pow(3,3));
        System.out.println("модуль комплексного числа = " + MathCalculable.module(2,3));
        System.out.println("PI = " + MathCalculable.PI());
        System.out.println("Длина окружности с R = 3 " + new MathFunc().Circumference(3));
    }
}
