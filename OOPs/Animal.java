package OOPs;

class species{
    void fly(){
        System.out.println("flying...");
    }
}

public class Animal extends species {
    void eat(){
        System.out.println("Animal is eating...");
    }
    void sound(){
        System.out.println("Making sound treee treee....");
    }

    @Override
    void fly() {
        System.out.println("Not supported");
    }
}
class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("bark");
    }
}



