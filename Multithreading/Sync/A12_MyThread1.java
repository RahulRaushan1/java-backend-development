package Multithreading.Sync;

public class A12_MyThread1 extends Thread {
   A11_TablePrintWithMethod t;
   A12_MyThread1(A11_TablePrintWithMethod t){
       this.t = t;
   }

    @Override
    public void run() {
        t.printTable(5);
    }
}
