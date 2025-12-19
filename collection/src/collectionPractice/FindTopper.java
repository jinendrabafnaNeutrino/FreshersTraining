package collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class FindTopper {
    public static void main(String args[]) {
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Snehal", 92);
        marks.put("Shruti", 88);
        marks.put("Sneha", 95);
        marks.put("Shubhangi", 90);

        String topper = "";
        int maxMarks = 0;

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            if (entry.getValue() > maxMarks) {
                maxMarks = entry.getValue();
                topper = entry.getKey();
            }
        }

        System.out.println("Topper: " + topper + "-" + maxMarks );
    }
}
