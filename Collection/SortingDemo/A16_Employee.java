package Collection.SortingDemo;

import java.util.Comparator;

public class A16_Employee implements Comparator {

    int id;
    String name;
    String dept;

    public A16_Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public A16_Employee() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        A16_Employee e1 = (A16_Employee) o1;
        A16_Employee e2 = (A16_Employee) o2;
        return e1.id - e2.id;
    }

    @Override
    public String toString() {
        return "A16_Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}
