public class Payment {
    void pay(){
        System.out.println("payment processing ");
    }
    public static void main(String [] args){
        Payment p = new UPI();
        p.pay();

        p =new CreditCard();
        p.pay();
    }
}

 class UPI extends Payment {
    @Override
    void pay(){
        System.out.println("payment processing using upi");
    }

}

class CreditCard extends Payment {
    @Override
    void pay(){
        System.out.println("payment processing using Credit Cards");
    }
}




