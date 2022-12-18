package mirea.pr8;

import java.util.Scanner;

public class w15 {
    public static void delNumber(int number){
        int x = number%10;
        number/=10;
        if (number==0 && x==0){
            return;
        }
        System.out.println(x);
        delNumber(number);
    }
    public static void main(String[] args){
        System.out.println("Вводите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        delNumber(number);
    }
}

