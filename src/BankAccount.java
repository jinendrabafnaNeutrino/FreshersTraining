public class BankAccount {
    String accountholderName;
    double balance;

    BankAccount(String accountholderName ,double balance){
        this.accountholderName = accountholderName;
        this.balance = balance;
    }

    void displayDetails(){
        System.out.println("Account Holder: "+accountholderName);
        System.out.println("Balance: "+ balance);

    }

    public static void main(String[] args){
        BankAccount account = new BankAccount("Nitish" ,1000000000.00);
        account.displayDetails();
    }
}
