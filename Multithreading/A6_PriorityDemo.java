package Multithreading;
class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority() );
    }
}
public class A6_PriorityDemo {
    public static void main(String[] args) {
        MyThread2 t2 = new MyThread2();
        t2.setName("Thread-2");
        t2.setPriority(Thread.MIN_PRIORITY);

        MyThread2 t3 = new MyThread2();
        t3.setName("Thread-2");
        t3.setPriority(Thread.MAX_PRIORITY);

        t2.start();
        t3.start();

    }
}
