class parent{}
class child extends parent{}
public class UpCasting {
    public static void main(StringExample[] args) {
        child c = new child();
        parent p = c;
        System.out.println("DownCasting Done");

    }
}
