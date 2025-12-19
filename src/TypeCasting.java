public class TypeCasting {

    // implicit typecasting: converting Lower data type to higher is smooth .

    int marks = 97;
    double percentage = marks / 100.0 ;

    //explicit typecasting: need typecast operator

    //Bill amount is in decimal, but system needs whole rupees.

    double billamount = 19.56;
    int payableamount = (int)billamount;





    public static void main(String [] args){
        TypeCasting tc = new TypeCasting();
        System.out.println(tc.percentage);
        System.out.println(tc.payableamount);
    }
}


