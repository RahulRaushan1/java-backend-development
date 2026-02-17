package Collection.SetDemo;

import java.util.Set;
import java.util.TreeSet;

public class A10_TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(40);
        set.add(10);
        set.add(770);
        set.add(40);
        set.add(230);
        System.out.println(set);
    }
}
