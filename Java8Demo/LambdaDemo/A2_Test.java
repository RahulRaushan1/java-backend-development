package Java8Demo.LambdaDemo;

public class A2_Test {
    public static void main(String[] args) {
//        A1_ThreadB t = new A1_ThreadB();
//        t.start();

        Runnable task =()-> System.out.println("Hello task");
        new Thread(task).start();;

        for(int i=0;i<5;i++){
            System.out.println("main ....");
        }
    }
}
