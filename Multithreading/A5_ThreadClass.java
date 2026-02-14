package Multithreading;
class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class A5_ThreadClass {
    public static void main(String[] args) {
        // start() ->
        //  run()  ->
        // getName() ->
        // setName() ->
        // setPriority()
        System.out.println(Thread.currentThread().getName());
        Thread t = Thread.currentThread();
        t.setName("Mera Thread");
        System.out.println(Thread.currentThread().getName());

        MyThread1 t1 = new MyThread1();
        t1.setName("Child Thread");
        t1.start();

    }
}
