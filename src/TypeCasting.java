public class TypeCasting {
    public static void main(String[] args) {
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
