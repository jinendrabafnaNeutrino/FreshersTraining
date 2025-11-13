class Vehicle {
    private String brand;
    private int speed;

    // Setter
    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    // Getter
    public int getSpeed() {
        return speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setBrand("Toyota");
        v.setSpeed(100);

        System.out.println(v.getBrand());
        System.out.println(v.getSpeed());
    }
}
