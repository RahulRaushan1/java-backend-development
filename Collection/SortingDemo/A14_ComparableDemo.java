package Collection.SortingDemo;

import java.util.ArrayList;
import java.util.Collections;

public class A14_ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(99);
        al.add(1);
        al.add(2);
        al.add(0);
        al.add(5);
        al.add(101);

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

        ArrayList<A15_Student> arrayList = new ArrayList<>();
        A15_Student s1 = new A15_Student(11,"raj");
        A15_Student s2 = new A15_Student(1,"rahul");
        A15_Student s3 = new A15_Student(88,"raghav");
        A15_Student s4 = new A15_Student(2,"simran");
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        ArrayList<A16_Employee> emp = new ArrayList<>();
        A16_Employee e1 = new A16_Employee(11,"Rohan","IT");
        A16_Employee e2 = new A16_Employee(6,"Rohan","IT");
        A16_Employee e3 = new A16_Employee(9,"Rohan","IT");

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        System.out.println(emp);
        Collections.sort(emp,new A16_Employee());
        System.out.println(emp);




    }
}
