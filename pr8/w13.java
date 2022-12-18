package mirea.pr8;

import java.util.Scanner;

public class w13 {
    public static void NotChetNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0){
            return;
        }
        System.out.println("Значение с нечетным индексом: " + number);
        number = scanner.nextInt();
        NotChetNumber();
    }
    public static void main(String[] args){
        System.out.println("Вводите числа, для завершение введите 0: ");
        NotChetNumber();
    }
}
