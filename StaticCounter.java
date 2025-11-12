public class StaticCounter {

    static int counter= 0;
        StaticCounter(){
            counter++;
        }

    public static void main(String[] args) {
        new StaticCounter();        // counter -> 1
        new StaticCounter();        // counter -> 2
        System.out.println(StaticCounter.counter); // prints 2

    }
}
