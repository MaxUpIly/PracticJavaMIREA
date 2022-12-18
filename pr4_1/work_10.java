package mirea.pr4_1;
abstract class Transport{
    protected double speed;
    protected double price;
    public void farePerson(double road,int countPerson){
        double time = road/speed;
        double priceRoad = road * price * countPerson;
        System.out.println("Время пути: " + time + " Cтоимость пути: " + priceRoad);
    }
    public void fareCargo(double road,int cargoWeight){
        double time = road/speed;
        double priceRoad = road * price * cargoWeight;
        System.out.println("Время пути: " + time + " Cтоимость перевозки: " + priceRoad);
    }
}
class Car extends Transport{
    public Car(double speed, double price){
        this.speed = speed;
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("Автомобиль- Скорость: %.2f км/час Цена за 1 км: %.2f руб",speed,price);
    }
}
class Train extends Transport{
    public Train(double speed, double price){
        this.speed = speed;
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("Поезд- Скорость: %.2f км/час Цена за 1 км: %.2f руб",speed,price);
    }
}
class Plane extends Transport{
    public Plane(double speed, double price){
        this.speed = speed;
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("Самолет- Скорость: %.2f км/час Цена за 1 км: %.2f руб",speed,price);
    }
}
class Ship extends Transport{
    public Ship(double speed, double price){
        this.speed = speed;
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("Корабль- Скорость: %.2f км/час Цена за 1 км: %.2f руб",speed,price);
    }

}
public class work_10 {
    public static void main(String[] args){
        Car car = new Car(100,50);
        Train train = new Train(150,100);
        Plane plane = new Plane(300,250);
        Ship ship = new Ship(200,150);
        System.out.println(car);
        car.farePerson(300,1);
        car.fareCargo(300,500);
        System.out.println(train);
        train.farePerson(300,1);
        train.fareCargo(300,500);
        System.out.println(plane);
        plane.farePerson(300,1);
        plane.fareCargo(300,500);
        System.out.println(ship);
        ship.farePerson(300,1);
        ship.fareCargo(300,500);

    }
}
