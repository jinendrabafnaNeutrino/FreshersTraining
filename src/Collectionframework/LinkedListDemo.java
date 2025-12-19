package Collectionframework;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main (String [] args){
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(34);
        l1.add(23);
        l1.add(345);
        l1.add(23);
        System.out.println(l1);
        l1.addFirst(12);
        System.out.println(l1);
        l1.addLast(876);
        System.out.println(l1);
        l1.size();
        System.out.println(l1);


        System.out.println( l1.contains(23));

        System.out.println(l1.indexOf(12));
    }
}
