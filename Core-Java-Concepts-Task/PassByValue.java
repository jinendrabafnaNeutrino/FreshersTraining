public class PassByValue {
    static void changeValue(int num) {
        num = num + 10;
    }

    public static void main(String[] args) {
        int x = 5;
        changeValue(x);
        System.out.println("After method call: " + x); // still 5
    }
}
