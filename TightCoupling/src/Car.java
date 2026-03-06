public class Car {

    //PetrolEngine engine = new PetrolEngine();
    // Engine engine= new DieselEngine();

    public Car(Engine engine) {
        this.engine = engine;
    }

    Engine engine;
    public void drive(){
        engine.start();
        System.out.println("car is moving...");
    }
}
