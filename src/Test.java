class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(x);
        System.out.println(super.x);
    }
}
public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
