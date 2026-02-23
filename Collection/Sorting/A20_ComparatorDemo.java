package Collection.Sorting;

import java.util.Comparator;
import java.util.TreeSet;

public class A20_ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<A21_Student> students = new TreeSet<>(new A22_MyComparator());
        students.add(new A21_Student(1,"Abhay",78));
        students.add(new A21_Student(3,"Rahul",78));
        students.add(new A21_Student(11,"Archana",78));
        students.add(new A21_Student(44,"Zurawar",78));
        students.add(new A21_Student(2,"Balu",78));

        System.out.println(students);

        Comparator<A21_Student> byroll = (s1,s2) ->s1.roll - s2.roll;
        Comparator<A21_Student> studentComparator= Comparator.comparing(A21_Student::getName)
                .thenComparing(A21_Student::getRoll);

    }
}
