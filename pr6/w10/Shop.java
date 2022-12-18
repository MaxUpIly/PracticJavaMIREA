package mirea.pr6.w10;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args){
        ArrayList<Computer> list_comp = new ArrayList<Computer>(1);
        Scanner scanner = new Scanner(System.in);
        int menu = 1;
        System.out.println("Добро пожаловать в наш магазин компьютеров!");
        while (menu != 0){
            System.out.println("Выбор действия (для завершения нажмите 0):");
            System.out.println("1-Просмотреть каталог");
            System.out.println("2-Добавить компьютер");
            System.out.println("3-Удалить компьютер");
            System.out.println("4-Найти компьютеры по фирме");
            menu = scanner.nextInt();
            switch (menu){
                case 1: {
                    if (list_comp.size() == 0){
                        System.out.println("Компьютеров нет в наличии");
                    }
                    else {
                        for (Computer comp: list_comp){
                            comp.print();
                        }
                    }
                    break;
                }
                case 2:{
                    list_comp.add(new Computer());
                    System.out.println("Компьютер добавлен!");
                    break;
                }
                case 3:{
                    if (list_comp.size() == 0){
                        System.out.println("Компьютеров нет в наличии");
                        break;
                    }
                    else {
                        int number = 0;
                        for (Computer comp: list_comp){
                            System.out.println("Компьютер под номером " + number);
                            comp.print();
                            number++;
                        }
                        System.out.println("Под каким номером удалить компьютер?");
                        System.out.println("Ответ: ");
                        menu = scanner.nextInt();
                        list_comp.remove(menu);
                        System.out.println("Компьютер удален!");
                        menu=-1;
                        break;
                    }
                }
                case 4:{
                    System.out.println("С какой фирмой найти компьютеры?");
                    String NameComp = scanner.next();
                    boolean Check = true;
                    for (Computer comp: list_comp){
                        if(NameComp.equals(comp.getName())){
                            comp.print();
                            Check = false;
                        }
                    }
                    if(Check){
                        System.out.println("Таких компьютеров нет в наличии!");
                    }
                    break;
                }
            }
        }
    }
}
