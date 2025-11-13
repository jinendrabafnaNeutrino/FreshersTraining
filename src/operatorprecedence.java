public class operatorprecedence {
    public static void main(String[] args) {
        // ((), unary, * / %, + -, comparisons, logicals, assignment).
        // a - b - c (left-to-right) and a = b = c (right-to-left).

        int result = 10 + 5 * 2 - 8 / 4 + 3 * (2 + 1);
        System.out.println("result: " + result);
    }
}
