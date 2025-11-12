public class car {

    String color;
    void drive()
    {
        System.out.println("Driving" +color);
    }

    public static void main(String[] args) {

        car c = new car();
        c.color = "red";
        c.drive();
    }
}
