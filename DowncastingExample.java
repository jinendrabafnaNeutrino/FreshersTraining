class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animals {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        Animals a = new Dog();     // Upcasting first
        Dog d = (Dog) a;          // ✅ Downcasting (explicit)

        d.sound();  // Allowed
        d.bark();   // Allowed
    }
}
