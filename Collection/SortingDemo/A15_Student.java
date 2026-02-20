package Collection.SortingDemo;

import OOPs.Student;

public class A15_Student implements Comparable <A15_Student> {

    int id;
    String name;

    public A15_Student(int id, String name) {
        this.id = id;
        this.name= name;
    }

    @Override
    public int compareTo(A15_Student o) {
        return this.id - o.id;
        // +
        // -
        // 0
    }

    @Override
    public String toString() {
        return "A15_Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
