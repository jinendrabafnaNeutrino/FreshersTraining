class parent{}
class child extends parent{}
public class DownCasting {
    public static void main(String[] args) {
        child c = new child();
        parent p = c;
        System.out.println("DownCasting Done");

    }
}
