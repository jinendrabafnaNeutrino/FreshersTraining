public class Precedence1 {

    public static void main(String[] args) {

        int a = 2 + 3 * 4; // 2 + (3*4) = 14
        int b = (2 + 3) * 4; // (5)*4 = 20
        System.out.println(a + ", " + b);
    }
}