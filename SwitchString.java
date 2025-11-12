public class SwitchString {
    public static void main(String[] args) {
        String color = "red";
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("Go");
                break;
            default: System.out.println("Wait");
        }
    }
}

