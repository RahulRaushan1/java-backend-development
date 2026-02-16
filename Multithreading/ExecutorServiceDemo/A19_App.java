package Multithreading.ExecutorServiceDemo;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class A19_App {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(8);
        String [] studentList ={ "Riya","raj","Ashu","Aman","Sachin","Sunny","Ankit","Adarsh","Rohit","Archana",
                "Shasank","Sagar","Anju","Saurabh"};

        for(String student:studentList){
            A18_CertificationSender task = new A18_CertificationSender(student);
            service.submit(task);
        }
        service.shutdown();
    }
}
