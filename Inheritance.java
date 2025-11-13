// Parent class
class Shape {
    void area() {
        System.out.println("Calculate area of shape");
    }
}

// Child class
class Triangle extends Shape {
    void area(int b, int h) {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();        // From parent class
        t.area(10, 5);   // From child class
    }
}
