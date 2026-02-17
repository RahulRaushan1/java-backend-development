package Collection.CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;


public class A2_ArrayListDemo {
    public static void main(String[] args) {
        // order
        // dublicate
        // index access
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);
        System.out.println(nums);
        System.out.println(nums.get(3));
        System.out.println(nums.size());
        if(nums.isEmpty()){
            System.out.println("List empty");
        }
        else System.out.println("not empty");
        nums.add(3,90);
        System.out.println(nums);

        Iterator<Integer> it= nums.iterator();
        while(it.hasNext()){
            int data= it.next();
            if(data==30){
                it.remove();
            }
            else {
                System.out.println(data);
            }
        }

    }
}
