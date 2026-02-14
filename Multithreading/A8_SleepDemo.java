package Multithreading;
class SleepThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println(getName() + "---"+i);
            try {
                Thread.sleep(1000); // 1 sec
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class A8_SleepDemo {
    public static void main(String[] args) {
         SleepThread t1 = new SleepThread();
         t1.setName("Child");
         t1.start();
    }
}
