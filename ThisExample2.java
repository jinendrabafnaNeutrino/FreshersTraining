public class ThisExample2 {
    int x, y;
    ThisExample2() { this(0,0); }         // calls other constructor
    ThisExample2(int x, int y)
    {
        this.x = x; this.y = y;
    }
    public static void main(String[] args) {
        ThisExample2 t1= new ThisExample2();
        System.out.println(t1.x + "," + t1.y); // 0,0
    }
}