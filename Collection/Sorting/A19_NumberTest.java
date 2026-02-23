package Collection.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A19_NumberTest {
    public static void main(String[] args) {
        List<A18_NumberDemo>al = new ArrayList<>();
        al.add(new A18_NumberDemo(10));
        al.add(new A18_NumberDemo(1));
        al.add(new A18_NumberDemo(130));
        al.add(new A18_NumberDemo(44));
        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);

    }
}
