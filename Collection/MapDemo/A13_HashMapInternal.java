package Collection.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class A13_HashMapInternal {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        // duplicates keys not allowed
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",5);
        map.put(null,1); // allowed
        map.put(null,43);

    }
}
