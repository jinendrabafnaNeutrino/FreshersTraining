public class TypeCasting {
<<<<<<< HEAD
    public static void main(String[] args) {
=======
    public static void main(StringExample[] args) {
>>>>>>> b2dae09 (Add full source code including src folder)
        //Implicit
        int x = 10;
        float y = x;
        System.out.println(((Object)y).getClass().getSimpleName());

        //Explicit
        long a = 100000;
        float b = (float)a;
        System.out.println(b);

    }
}
