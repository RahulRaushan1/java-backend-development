package Collection.CollectionDemo;

import java.util.ArrayList;


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

    }
}
