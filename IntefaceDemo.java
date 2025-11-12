//flyable
interface Flyable {
    void fly();
}
class Bird implements Flyable{
    public void fly(){
        System.out.println("Bird flies");
    }

}
public class IntefaceDemo{

    public static void main(String[] args) {

        Flyable f= new Bird();
        f.fly();
    }
}
