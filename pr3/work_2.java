package mirea.pr3;

public class work_2 {
    public static void main(String[] args){
        //Первое задание
        double pi = 3.14;
        Double PI = Double.valueOf(pi);
        System.out.println(PI);
        //Второе задание
        String str = "3.14";
        double a = Double.parseDouble(str);
        System.out.println(a);
        //Третье задание
        Double D = Double.parseDouble(str);
        byte b = D.byteValue();
        System.out.printf("Byte: %s%n",b);
        short s = D.shortValue();
        System.out.printf("Short: %s%n",b);
        int i = D.intValue();
        System.out.printf("Int: %s%n",b);
        long l = D.longValue();
        System.out.printf("Long: %s%n",b);
        float f = D.floatValue();
        System.out.printf("float: %s%n",b);
        //Четвертое задание сверху
        //Пятое задание
        String d = Double.toString(pi);
        System.out.println(pi);


    }
}
