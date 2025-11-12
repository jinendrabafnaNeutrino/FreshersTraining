interface Swimmer { void swim(); }
interface Runner { void run(); }

class Triathlete implements Swimmer, Runner {
    public void swim() { System.out.println("Swimming"); }
    public void run()  { System.out.println("Running"); }
}

public class MultiInterface {
    public static void main(String[] args) {
        Triathlete t = new Triathlete();
        t.swim(); t.run();
    }
}
