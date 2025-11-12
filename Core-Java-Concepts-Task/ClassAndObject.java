class Car {
    String brand = "Tesla";
    void display() { System.out.println("Car brand: " + brand); }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.display();
    }
}