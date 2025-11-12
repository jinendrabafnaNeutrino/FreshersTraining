//parameterized constuctor
public class Point {
    int x,y ;
        Point(int a,int b) {
            x = a;
            y = b;
        }

    public static void main(String[] args) {
        Point p = new Point(2,3);
        System.out.println(p.x + " ," +p.y);
    }

    }

