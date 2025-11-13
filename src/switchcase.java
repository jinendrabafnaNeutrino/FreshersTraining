import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 100;
        int num2 = 200;

        System.out.println("enter which operation you want to perform:");
        System.out.println("1 > addition");
        System.out.println("2 > subtraction");
        System.out.println("3 > multiplication");
        System.out.println("4 > division");
        int choice = sc.nextInt();

        double result=0;

        switch(choice){
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case 4:
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid choice");
                break;


            }

        }


    }

