public class TypeCasting{
    public static void main(String[] args) {
        int a = 10;
        double b = a; 
        System.out.println("Implicit casting: " + b);

        double x = 10.75;
        int y = (int) x; 
        System.out.println("Explicit casting: " + y);
    }
}