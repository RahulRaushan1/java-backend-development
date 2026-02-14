package Multithreading;
class JoinThread extends Thread{
    @Override
    public void run() {

        for(int i=0;i<=5;i++){
            System.out.println("child thread");
        }
    }
}
public class A9_JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinThread t1 = new JoinThread();
        t1.start();
        t1.join();  // main - jo line execute krega wait krega
        for(int i=0;i<=5;i++){
            System.out.println("main thread");
        }
    }
}
