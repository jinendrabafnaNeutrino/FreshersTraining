package Collectionframework;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String [] args){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Nitish");
        map.put(102, "Amit");
        map.put(103, "Rahul");
        map.put(102, "Kunal");

        System.out.println(map);
        System.out.println("Value of key 101: " + map.get(101));
        System.out.println("Contains key 103? " + map.containsKey(103));
        System.out.println("Size: " + map.size());

    }


}
