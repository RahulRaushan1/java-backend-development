package Collection.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class A17_ComparableDemo {
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
    }
}
