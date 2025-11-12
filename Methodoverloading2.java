public class Methodoverloading2 {
    static double area(double r)
    {
        return Math.PI*r*r;
    }        // circle
    static double area(double l, double w)
    {
        return l*w;
    }      // rectangle
    public static void main(String[] args) {
        System.out.println(area(2));       // circle area
        System.out.println(area(2,3));     // rectangle area
    }
}
