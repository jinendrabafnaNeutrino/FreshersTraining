import java.util.ArrayList;
import java.util.List;

public class eventregistratio {
    public static void main(String[] args) {
        List<String> guestlist =new ArrayList<>();
        guestlist.add("Sneha Chavan");
        guestlist.add("nandini kadam");
        guestlist.add("snehal mathure");
        guestlist.add("shubhangi hedau");
        guestlist.add(1,"sakshi");
        guestlist.remove(1);

        System.out.println("guestlist: "+guestlist);
        System.out.println("guestlist size: "+guestlist.size());
    }
}
