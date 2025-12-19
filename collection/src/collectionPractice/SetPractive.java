package collectionPractice;

import java.util.HashSet;
import java.util.Set;

public class SetPractive {

    public static void main(String args[])
    {
        Set<String> names=new HashSet<>();
        names.add("Snehal");
        names.add("Snehal");
        names.add("Shruti");
        names.add("Sneha");
        names.add("Shubhangi");

        for(String name : names)
        {
            System.out.println(name );
        }

        Set<String> names2=new HashSet<>();
        names2.add("Kushal");
        names2.add("Shubhangi");
        names2.add("Shruti");
        names2.add("Ashish");
        names2.add("John");

        Set<String> union =new HashSet<>(names);
        union.addAll(names2);
        System.out.print("Union(AUB):"+ union +"\n");

        Set<String> intersection = new HashSet<>(names);
        intersection.retainAll(names2);
        System.out.print("intersection: "+ intersection);
    }
}
