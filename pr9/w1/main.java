package mirea.pr9.w1;

import java.util.ArrayList;

public class main {
    static public void main(String[] args){
        ArrayList<Student> list = new ArrayList<Student>(1);
        Student st1= new Student(3);
        Student st2 = new Student(1);
        Student st3 = new Student(5);
        Student st4 = new Student(2);
        Student st5 = new Student(4);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        for (int left = 0; left < list.size(); left++) {
            // Вытаскиваем значение элемента
            Student value = list.get(left);
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.compareTo(list.get(i)) == -1) {
                    list.set(i + 1, list.get(i));
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            list.set(i + 1, value);
        }
        for(Student x: list){
            System.out.println(x);
        }
    }
}
