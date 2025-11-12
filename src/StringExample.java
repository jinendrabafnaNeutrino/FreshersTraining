public class StringExample {
    public static void main(String[] args) {
        String original = "Hello World";

        // Create StringBuilder
        StringBuilder sb = new StringBuilder(original);

        // Reverse the string
        sb.reverse();

        // Convert back to string and print
        String reversed = sb.toString();
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}

