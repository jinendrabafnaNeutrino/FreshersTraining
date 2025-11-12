import java.util.ArrayList;
public class passByValueObject2 {

    static void addItem(ArrayList<String> list) {
        list.add("new");
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        addItem(arr);
        System.out.println(arr);
    }
}



