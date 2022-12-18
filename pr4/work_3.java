package mirea.pr4;

import java.util.ArrayList;
import java.util.Scanner;

public class work_3 {
    public enum Menu{ //переименовать в меню и добавить кнопку возврата и корзины
        Товары,
        Компьютер,
        Телефон,
        Консоль,
        Корзина;

        ArrayList <Catalogue> cart = new ArrayList<Catalogue>();
        public void CartPlus(String goods){
            Catalogue x = Catalogue.valueOf(goods);
            cart.add(x);
        }
        public ArrayList <Catalogue> GetCart(){
            return cart;
        }
        public void ClearCart(){cart.clear();}
    }
    public enum Catalogue{
        Мышка(1000),
        Клавиатура(1500),
        Камера(500),
        Чехол(300),
        Зарядка(500),
        Повербанк(1200),
        XBOX(25000),
        Playstation(30000),
        Switch(15000);
        private float price;
        Catalogue(float price){
            this.price = price;
        }
        public float GetPrice(){
            return price;
        }

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        String str ="";
        str = scanner.next();
        if (str.equals("логин") || str.equals("Логин") ){
            System.out.println("Введите пароль:");
            str = scanner.next();
            if(str.equals("пароль") || str.equals("Пароль")){
                System.out.println("Авторизация прошла успешно!");
            }
            else {System.out.println("Неверно! Выход из системы!"); return;}
        }
        else {System.out.println("Неверно! Выход из системы!"); return;}
        float price = 0;
        Menu menu = Menu.Корзина;
        while(!str.equals("Купить")){
            for(Menu menuAll: Menu.values()){
                System.out.println(menuAll);
            }
            System.out.println("Меню-выберите каталог или действие:");
            str = scanner.next();
            menu = Menu.valueOf(str);
            switch (menu){
                case Консоль:{
                    System.out.println(Catalogue.XBOX + " " + Catalogue.XBOX.GetPrice()+ "₽");
                    System.out.println(Catalogue.Playstation + " " + Catalogue.Playstation.GetPrice()+ "₽");
                    System.out.println(Catalogue.Switch + " " + Catalogue.Switch.GetPrice()+ "₽");
                    System.out.println("Введите какой предмет положить в корзину:");
                    str = scanner.next();
                    if(str.equals("Назад")){

                    }
                    else if(str.equals("XBOX") || str.equals("Playstation")|| str.equals("Switch")){
                        menu.Корзина.CartPlus(str);
                        price+=Catalogue.valueOf(str).GetPrice();
                        System.out.println("Товар добавлен в корзину!");
                    }
                    else System.out.println("Ошибка!");
                    break;
                }
                case Телефон:{
                    System.out.println(Catalogue.Чехол + " " + Catalogue.Чехол.GetPrice()+ "₽");
                    System.out.println(Catalogue.Зарядка + " " + Catalogue.Зарядка.GetPrice()+ "₽");
                    System.out.println(Catalogue.Повербанк + " " + Catalogue.Повербанк.GetPrice()+ "₽");
                    System.out.println("Введите какой предмет положить в корзину:");
                    str = scanner.next();
                    if(str.equals("Назад")){

                    }
                    else if(str.equals("Чехол") || str.equals("Зарядка")|| str.equals("Повербанк")){
                        menu.Корзина.CartPlus(str);
                        price+=Catalogue.valueOf(str).GetPrice();
                        System.out.println("Товар добавлен в корзину!");
                    }
                    else System.out.println("Ошибка!");
                    break;

                }
                case Компьютер:{
                    System.out.println(Catalogue.Мышка + " " + Catalogue.Мышка.GetPrice()+ "₽");
                    System.out.println(Catalogue.Клавиатура + " " + Catalogue.Клавиатура.GetPrice()+ "₽");
                    System.out.println(Catalogue.Камера + " " + Catalogue.Камера.GetPrice()+ "₽");
                    System.out.println("Введите какой предмет положить в корзину:");
                    str = scanner.next();
                    if(str.equals("Назад")){

                    }
                    else if(str.equals("Мышка") || str.equals("Клавиатура")|| str.equals("Камера")){
                        menu.Корзина.CartPlus(str);
                        price+=Catalogue.valueOf(str).GetPrice();
                        System.out.println("Товар добавлен в корзину!");
                    }
                    else System.out.println("Ошибка!");
                    break;
                }
                case Товары:{
                    for(Catalogue goods: Catalogue.values()){
                        System.out.println(goods + " " + goods.GetPrice()+ "₽");
                    }
                    System.out.println("Введите какой предмет положить в корзину:");
                    str = scanner.next();
                    menu.Корзина.CartPlus(str);
                    price+=Catalogue.valueOf(str).GetPrice();
                    System.out.println("Товар добавлен в корзину!");
                    break;
                }
                case Корзина:{
                    for(Catalogue lol: menu.Корзина.GetCart()){
                        System.out.println(lol + " " + lol.GetPrice());
                    }
                    System.out.println("Итоговая цена за все товары: " + price + "₽");
                    System.out.println("Выберите действие:");
                    System.out.println("Купить/Очистить");
                    str = scanner.next();
                    if(str.equals("Купить")){
                        System.out.println("Заказ сформирован, подтвердите покупку на почте!");
                    }
                    else if(str.equals("Очистить")){
                        menu.ClearCart();
                        price = 0;
                        System.out.println("Корзина очищена!");
                    }
                    break;
                }
            }
        }
    }
}
