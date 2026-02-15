package Multithreading.LockDemo;

public class A17_Driver {
    public static void main(String[] args) {
        A16_BankAccount account = new A16_BankAccount();

        Runnable t1 = ()-> account.withdraw("wife",10000);
        Runnable t2 = ()-> account.withdraw("papa",500);

        new Thread(t1).start();
        new Thread(t2).start();
    }
}
