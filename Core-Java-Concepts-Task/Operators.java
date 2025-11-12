public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Addition: " + (a + b));

        System.out.println("Is a > b? " + (a > b));

        System.out.println("Logical AND: " + (a > 5 && b < 10));

        System.out.println("Bitwise AND: " + (a & b));

        a += 5;
        System.out.println("After += : " + a);
    }
}
