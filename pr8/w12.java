package mirea.pr8;

import java.util.Scanner;

public class w12 {
    public static void NotChetNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean flag = true;
        if (number == 0){
            return;
        }
        if(number % 2 != 0 ){
            System.out.println("Нечетное значение:" + number);
        }
        NotChetNumber();
    }
    public static void main(String[] args){
        System.out.println("Вводите числа, для завершение введите 0: ");
        NotChetNumber();
    }
}
