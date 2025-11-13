public class DataTypes {
    public static void main(StringExample[] args){
        int a = 12;
        long b = 150000l;
        float c = 1.2f;
        double d = 1.2424;
        StringExample e = "a";
        short f = 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(((Object)a).getClass().getSimpleName());
        System.out.println(((Object)b).getClass().getSimpleName());
        System.out.println(((Object)c).getClass().getSimpleName());
        System.out.println(((Object)d).getClass().getSimpleName());
        System.out.println(((Object)e).getClass().getSimpleName());
        System.out.println(((Object)f).getClass().getSimpleName());



    }
}