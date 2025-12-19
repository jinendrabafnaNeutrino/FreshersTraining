package collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Snehal");
        students.put(2, "Shruti");
        students.put(3, "Sneha");
        students.put(4, "Shubhangi");

        // Loop through Map
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
