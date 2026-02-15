package Java8Demo.LambdaDemo;

public class A1_ThreadB  extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("hello");
        }
    }
}
