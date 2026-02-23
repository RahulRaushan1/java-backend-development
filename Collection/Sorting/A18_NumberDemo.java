package Collection.Sorting;

public class A18_NumberDemo implements Comparable<A18_NumberDemo> {
    int value;

    public A18_NumberDemo(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(A18_NumberDemo o) {
        return this.value - o.value;
        //+
        //-
        //0
    }

    @Override
    public String toString() {
        return "A18_NumberDemo{" +
                "value=" + value +
                '}';
    }
}
