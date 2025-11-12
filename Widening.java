//Implicit widening (safe): small → larger type (e.g., int → long, int → double).
//
//Explicit narrowing (may lose data): needs cast (e.g., double → int).

//Reference casts: casting between compatible class types (upcast/downcast) — requires runtime check for downcast.
public class Widening {
    public static void main(String[] args) {
        int a =10;
        double d =a;  //Implicit casting

        double x = 9.7;
        int y = (int) x;  //explicit casting

        System.out.println("double:"+d+",int:"+y);
    }


}
