package Collection.SetDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class A9_LinkedHashset {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(20);
        set.add(20); 
        set.add(30);
        set.add(10);

        System.out.println(set);

    }
}
