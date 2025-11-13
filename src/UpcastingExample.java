class Animal {
    public void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    public void bark() { System.out.println("Dog barks"); }
}

public class UpcastingExample {
    public static void main(String[] args) {
       /* Dog d = new Animal();
        d.sound();
        d.bark();

        Dog dd = new Animal();
        dd.bark();*/
    }
}
