package Multithreading;

class MyTask implements Runnable
{

    @Override
    public void run() {
        System.out.println("runnable....");
    }
}
public class A3_InterfaceDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyTask());
        t.start();
    }
}
