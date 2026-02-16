package Collection.CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class A3_ClearProg {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=5;i++){
            list.add(i);
        }
        System.out.println("List is :" +list);
        if(list.isEmpty()){
            System.out.println("list is empty");
        }
        else System.out.println("list is not empty");
    }
}
