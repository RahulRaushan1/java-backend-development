package Multithreading;
class EvenThread extends Thread{
    @Override
    public void run() {
        for(int i=2;i<=10;i=i+2){
            System.out.println("Even :"+i);
        }
    }
}
class OddThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=9;i=i+2){
            System.out.println("odd :"+i);
        }
    }
}

public class A4_EvenOdd {
    public static void main(String[] args) {

//        EvenThread e = new EvenThread();
//        e.start();
         new EvenThread().start();
         new OddThread().start();
    }
}
