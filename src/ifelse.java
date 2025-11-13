public class ifelse {
    public static void main(String[] args) {
        String username = "Sneha";
        String password = "12345";


        if (username.equals("Sneha")) {

            if (password.equals("12345")) {
                System.out.println("login successful");
            } else {
                System.out.println("incorrect password");
            }

        } else {
            System.out.println("username not found");
        }
    }
}
