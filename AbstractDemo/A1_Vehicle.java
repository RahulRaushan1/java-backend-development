package AbstractDemo;

public  abstract class A1_Vehicle {
    String brand;

    A1_Vehicle(String brand){
        this.brand = brand;
    }

    abstract void start();

    public void m1(){
        System.out.println("hello m1");
    }
}
