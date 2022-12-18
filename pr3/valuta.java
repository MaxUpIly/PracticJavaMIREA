package mirea.pr3;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class valuta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите начальную валюту");
        System.out.println("1 - Рубль 2 - Доллар 3 - Евро:");
        int n = scanner.nextInt();
        while (n!=1 && n!=2 && n!= 3){
            System.out.print("Ошибка! Повторите попытку: ");
            n = scanner.nextInt();
        }
        System.out.println("Введите сумму: ");
        float cash = scanner.nextFloat();
        NumberFormat numberRUB = NumberFormat.getCurrencyInstance();
        numberRUB.setCurrency(Currency.getInstance("RUB"));

        NumberFormat numberDollar = NumberFormat.getCurrencyInstance();
        numberDollar.setCurrency(Currency.getInstance("USD"));

        NumberFormat numberEuros = NumberFormat.getCurrencyInstance();
        numberEuros.setCurrency(Currency.getInstance("EUR"));

        switch(n){
            case(1):
                System.out.println("RUB: " + numberRUB.format(cash));
                System.out.println("USD: " + numberDollar.format(cash*0.0159));
                System.out.println("EUR: " + numberEuros.format(cash*0.016));
                break;
            case(2):
                System.out.println("RUB: " + numberRUB.format(cash*63.0558));
                System.out.println("USD: " + numberDollar.format(cash));
                System.out.println("EUR: " + numberEuros.format(cash*1.0094));
                break;
            case(3):
                System.out.println("RUB: " + numberRUB.format(cash*62.4695));
                System.out.println("USD: " + numberDollar.format(cash*0.9907));
                System.out.println("EUR: " + numberEuros.format(cash));
                break;
        }


    }
}
