package Multithreading.ExecutorServiceDemo;

public class A18_CertificationSender implements Runnable{
    private final String stdName;

    public A18_CertificationSender(String stdName){
        this.stdName=stdName;
    }
    @Override
    public void run() {
        System.out.println("Sending certificate to "+stdName+
                "by thread" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("certificate sent "+stdName+"by thread"+
                Thread.currentThread().getName());
    }
}
