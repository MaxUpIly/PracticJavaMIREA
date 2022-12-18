package mirea.pr4_1;
class Phone{
    private long number;
    private String model;
    private int weight;

    public Phone(long number,String model,int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(long number,String model){
        this.number = number;
        this.model = model;
        weight = 0;
    }
    public Phone(){
        number = -1;
        model = "NoName";
        weight = -1;
    }
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, long number) {
        System.out.println("Звонит " + name + " Номер телефона: " + number);
    }
    public long getNumber(){
        return number;
    }
    public void sendMessage(long[] nubmers){
        System.out.println("Сообщение отправлденно данным номерам: ");
        for(long x:nubmers){
            System.out.println(x);
        }
    }
    @Override
    public String toString() {
        return "Модель телефона: " + model + " Номер телефона: " + number + " Вес телефона: " + weight;
    }
}
public class work_2 {
    public static void main(String[] args){
        Phone phone_1 = new Phone(9999670771L,"iphone",150);
        Phone phone_2 = new Phone(9167354055L,"Samsung");
        Phone phone_3 = new Phone();
        System.out.println(phone_1);
        System.out.println(phone_2);
        System.out.println(phone_3);
        phone_1.receiveCall("Максим");
        phone_1.receiveCall("Максим",9856401325L);
        System.out.println("Номер второго телефона: " + phone_2.getNumber());
        long[] numbers = new long[3];
        numbers [0] = 9165348090L;
        numbers [1] = 9881234567L;
        numbers [2] = 9250873478L;
        phone_1.sendMessage(numbers);

    }
}
