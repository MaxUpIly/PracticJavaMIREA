package mirea.pr3;
import java.lang.*;
import java.util.Arrays;
import java.util.Random;


public class work_1_1 {
    public static void main(String[] args){
        System.out.println("Генерация случайных числел через класс Random: ");
        Random rand = new Random();
        int [] mass = new int[10];
        for (int i = 0; i<10; i++){
            mass[i] = rand.nextInt();
        }
        System.out.println("Массив: ");
        for(int x:mass){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Отсортированный массив: ");
        Arrays.sort(mass);
        for(int x:mass){
            System.out.print(x + " ");
        }
        System.out.println();
        //2 массив
        System.out.println("Генерация случайных числел через класс Math: ");
        double [] mass_2 = new double[10];
        for (int i = 0; i<10; i++){
            mass_2[i] = Math.random();
        }
        System.out.println("Массив: ");
        for(double x:mass_2){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Отсортированный массив: ");
        Arrays.sort(mass_2);
        for(double x:mass_2){
            System.out.print(x + " ");
        }

    }


}
