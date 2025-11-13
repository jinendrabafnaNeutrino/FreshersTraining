abstract class Vehicles {
    abstract void start();  // abstract method
    void wheels() {         // normal method
        System.out.println("All vehicles have wheels");
    }
}

class Car extends Vehicles {
    void start() {
        System.out.println("Car starts with key");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.wheels();
    }
}
