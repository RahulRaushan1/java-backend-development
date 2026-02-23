package Collection.Sorting;

import java.util.Comparator;

public class A22_MyComparator implements Comparator <A21_Student>  {
    @Override
    public int compare(A21_Student o1, A21_Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
