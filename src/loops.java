public class loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 3; i++)
            System.out.println("i= " + i);



        // while loop
        int j = 1;
        while (j <= 3) {
            System.out.println("while loop: " + j);
            j++;
        }



        // do-while
        int k = 4;
        do {
            System.out.println("Do-while loop: " + k);
            k++;
        } while (k <= 3);
    }
}
