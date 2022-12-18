package mirea.pr3;

import java.util.Random;

public class work_1_3 {
    public static void main(String[] args){
        Random rand = new Random();
        int mass[] = new int[4];
        for(int i = 0; i!=4;i++){
            mass[i]= rand.nextInt(10,99);
        }
        for(int x: mass){
            System.out.print(x + " ");
        }
        System.out.println();
        if(mass[0]< mass[1] && mass[1] < mass[2] && mass[2]<mass[3]) {
            System.out.println("Строго возрастает!");
        }
        else {System.out.println("Не возрастает!");}

    }
}

