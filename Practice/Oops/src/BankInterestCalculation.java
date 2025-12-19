import java.util.Scanner;


//method Overriding
//run time polymorphism
//do while loop
//switch case

class Bank
{
     double calculateInterest(int amount, int year)
    {
        return amount * year * 0.04;
    }

}
class SBI extends Bank{
        @Override
        double calculateInterest(int amount, int year)
        {
            return amount * year * 0.065;
        }

}
class ICICI extends Bank{
    @Override
    double calculateInterest(int amount, int year)
    {
        return amount * year * 0.05;
    }
}


public class BankInterestCalculation {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
       int choice=0;
       Bank b;
       int amount,year;

        do
        {
        System.out.println("which bank you want to choose??");
        System.out.println("1.SBI");
        System.out.println("2.ICICI");
        System.out.println("0.Exit");

        choice=sc.nextInt();



            switch(choice) {
                case 1:
                    System.out .println("Enter amount and years");
                    amount=sc.nextInt();
                    year=sc.nextInt();
                    b=new SBI();
                    System.out.println(b.calculateInterest(amount,year));
                    break;

                case 2:
                    System.out .println("Enter amount and years");
                    amount=sc.nextInt();
                    year=sc.nextInt();
                    b=new ICICI();
                    System.out.println(b.calculateInterest(amount,year));
                    break;

                case 0:
                    System.exit(0);

            }
        }while(choice!=0);



    }
}
