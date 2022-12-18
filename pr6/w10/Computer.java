package mirea.pr6.w10;

import mirea.pr4.work_1;

import java.util.Scanner;
enum NameComp{
    MSI,
    ASUS,
    Apple
}

public class Computer {
    private String name;
    private Processor cpu;
    private Memory ram;
    private Monitor monitor;

    public Computer() {
        Scanner scanner = new Scanner(System.in);
        String Sc_name;
        int Sc_character;
        System.out.print("Введите название PC (MSI/ASUS/Apple (иначе сбой системы)): ");
        Sc_name = scanner.nextLine();

        name = String.valueOf(NameComp.valueOf(Sc_name));
        System.out.print("Введите название CPU: ");
        Sc_name = scanner.next();
        System.out.print("Введите кол-во GHz CPU: ");
        scanner.nextLine();
        Sc_character = scanner.nextInt();
        cpu = new Processor(Sc_name, Sc_character);


        System.out.print("Введите название RAM: ");
        Sc_name = scanner.next();
        System.out.print("Введите кол-во гигабайт RAM: ");
        scanner.nextLine();
        Sc_character = scanner.nextInt();
        ram = new Memory(Sc_name, Sc_character);


        System.out.print("Введите название монитора: ");
        Sc_name = scanner.next();
        System.out.print("Введите диагональ монитора: ");
        scanner.nextLine();
        Sc_character = scanner.nextInt();
        monitor = new Monitor(Sc_name, Sc_character);
    }
    void print(){
        System.out.println("Компьютер фирмы " + name + " с характеристиками: ");
        System.out.println(cpu);
        System.out.println(ram);
        System.out.println(monitor);
        System.out.println();
    }
    String getName(){
        return name;
    }
}
