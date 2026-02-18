package Collection.MapDemo;

import java.util.HashMap;
import java.util.Map;

public class A12_HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        // duplicates keys not allowed
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",5);
        map.put(null,1); // allowed
        map.put(null,43);
        // null allowed at once only because duplicate keys not allowed
        System.out.println(map.get("four"));

        if(map.containsKey("four")){
            System.out.println(map.get("four"));
        }

        for(String data : map.keySet()) {
            System.out.println("key: " +data+"<--> value :"+map.get(data));

        }

        for(Integer value:map.values()){
            System.out.println("Value :"+ value);
        }

        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("key :" +entry.getKey() + "Value :"+entry.getValue());
        }
        // java 8
        map.forEach((key,value)->{
            System.out.println("key :"+key);
            System.out.println("value :"+value);
        });

    }
}
