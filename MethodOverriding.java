class Cars {
    void sound() {
        System.out.println("Vehicle makes a sound");
    }
}

class Bike extends Cars {
    @Override
    void sound() {
        System.out.println("Bike goes Vroom Vroom");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Cars c = new Bike();  // Upcasting
        c.sound();  // Calls child class method at runtime
    }
}
