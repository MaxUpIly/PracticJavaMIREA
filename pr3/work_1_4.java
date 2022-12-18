package mirea.pr3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class work_1_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число больше нуля: ");
        int n = scanner.nextInt();
        while (n<=0){
            System.out.print("Ошибка! Повторите попытку: ");
            n = scanner.nextInt();
        }
        int[] mass = new int[n];
        Random rand = new Random();
        for(int i = 0; i!=n;i++){
            mass[i]= rand.nextInt(n+1);
        }
        for(int x: mass){
            System.out.print(x + " ");
        }
        System.out.println();
        ArrayList<Integer> chet_list = new ArrayList<Integer>();
        for (int x:mass){
            if (x%2==0) {chet_list.add(x);}
        }
        System.out.println(chet_list);
    }
}