public class Loops {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 3; i++)
            System.out.println("For loop: " + i);

        int j = 1;
        while (j <= 3) {
            System.out.println("While loop: " + j);
            j++;
        }

        int k = 1;
        do {
            System.out.println("Do-while loop: " + k);
            k++;
        } while (k <= 3);
    }
}
