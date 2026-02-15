package Java8Demo.Functionalinterface;

@FunctionalInterface
public interface A1_Calsy {
    int add (int a ,int b);
    default void m1 (){
        System.out.println("hello");
    }

}
class child implements A1_Calsy {
    @Override
    public int add(int a, int b) {
        return 0;
    }
}

//   after java 1.8
class Driver{
    public static void main(String[] args) {
        A1_Calsy oper =(a,b)->a+b;
        System.out.println(oper.add(5,5 ));
    }
}