abstract class Animalss {
    abstract void sound();         // must be implemented by subclass
    void sleep() { System.out.println("Sleeping"); }
}

class Cat extends Animalss {
    void sound() { System.out.println("Meow"); }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Animalss a = new Cat();
        a.sound(); // Meow
        a.sleep(); // Sleeping
    }
}
