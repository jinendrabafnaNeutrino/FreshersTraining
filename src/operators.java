public class operators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // Arithmetic
        System.out.println("a+b:"+(a+b));
        System.out.println("a*b:"+(a*b));
        System.out.println("a%b:"+(a%b));

        //relational
        System.out.println("is a>b:"+(a>b));
        System.out.println("is a euals to b:"+(a==b));

        // logical
        System.out.println("logical AND:"+(a>0 && b>0));
        System.out.println("logical OR:"+(a>=0 && b<10));
        System.out.println("logicL NOT:"+ !(a>0));

        // bitwise
        System.out.println("bitwise AND:"+(a&b));

        // assignment operator
        System.out.println("a+=2:"+(a+=2));

    }
}
