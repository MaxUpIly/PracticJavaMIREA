package mirea.pr6.w11;

import java.util.Scanner;

public class Temp {
    private double CF = 1.8;
    private double CK = 273.15;
    public void convert(double x) {
        System.out.println("По Фаренгейту: " + (32 + x * CF));
        System.out.println("По Кельвину: " + (x + CK));
    }
    public static void main(String[] args){
        System.out.println("Введите температуру по Цельсию: ");
        Scanner scanner = new Scanner(System.in);
        double temp = scanner.nextInt();
        Temp x = new Temp();
        x.convert(temp);
    }
}


