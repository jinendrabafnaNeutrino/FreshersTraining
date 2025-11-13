public class MethodOverloadingExample {
    void add(int a, int b) {
        System.out.println("sum: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("sum: " + (a + b));
    }
    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();
        // passing values
        obj.add(5, 10);
        obj.add(2.5, 3.5);
    }
}
