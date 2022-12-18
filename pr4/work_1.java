package mirea.pr4;

import java.util.Scanner;

public class work_1 {
    public enum Season{
        Зима(-10) { public  String GetDescription(){ return "Холодное время года";}},
        Весна(10) { public  String GetDescription(){ return "Теплое время года";}},
        Лето(17) { public  String GetDescription(){ return "Теплое время года";}},
        Осень(5){ public  String GetDescription(){ return "Холодное время года";}};
        private float temp;
        Season(float temp){
            this.temp = temp;
        }
        public void SetTemp(float temp){ this.temp = temp;}
        public float GetTemp(){ return temp;}
        public abstract String GetDescription();
    }
    public static void main(String[] args){
        Season loveSeason = Season.Лето;
        System.out.println(loveSeason);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое любимое время года c большой буквы:");
        String str = scanner.next();
        Season season = Season.valueOf(str);
        switch (season) {
            case Зима:{
                System.out.println("Я люблю зиму");
                break;
            }
            case Лето:{
                System.out.println("Я люблю лето");
                break;
            }
            case Весна:{
                System.out.println("Я люблю весну");
                break;
            }
            case Осень:{
                System.out.println("Я люблю осень");
                break;
            }
        }
        for (Season seasonAll : Season.values()){
            System.out.println(seasonAll + " Средняя температура: " + seasonAll.GetTemp() + "°C " + seasonAll.GetDescription());
        }

    }
}
