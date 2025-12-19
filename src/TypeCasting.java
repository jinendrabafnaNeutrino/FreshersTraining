public class TypeCasting {
    public static void main(String [] args)
    {
        //widening
        int i=10;
        System.out.println("before widening "+ i);
        double d= i;
        System.out.println("after widening "+ d);

        //narrowing
        double n=100.45;
        short s=(short)n;
        System.out.println("before narrowing "+ n);
        System.out.println("after narrowing "+ s);

    }
}
