package AbstractDemo;

public interface A4_Animal {
    void makeSound();
    void eat();
}

class Dog implements A4_Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }

    @Override
    public void eat() {
        System.out.println("milk roti");
    }

    public static void main(String[] args) {
        A4_Animal dog = new Dog();
        dog.eat();
        dog.makeSound();
    }
}