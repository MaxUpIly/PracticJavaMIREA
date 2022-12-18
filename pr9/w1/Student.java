package mirea.pr9.w1;

public class Student implements Comparable<Student>{
    int iDNumber;
    public Student(int id){
        iDNumber = id;
    }
    public int compareTo(Student s){
        if (this.iDNumber < s.iDNumber){
            return -1;
        }
        if (this.iDNumber > s.iDNumber){
            return 1;
        }
        else return 0;
    }

    @Override
    public String toString() {
        return "ID студента: " + iDNumber;
    }
}
