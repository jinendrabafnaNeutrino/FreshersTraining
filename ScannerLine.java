
import java.util.Scanner;

public class ScannerLine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        sc.nextLine();//newline
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println(name + " is " + age + " years old");

        sc.close();






    }
}
