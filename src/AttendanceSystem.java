import java.util.ArrayList;

public class AttendanceSystem {
    public static void main(String [] args){
        ArrayList<String> presentStudents = new ArrayList<>();

        presentStudents.add("Nitish");
        presentStudents.add("Abhijit");
        presentStudents.add("Kunal");
        presentStudents.add("Varad");
        presentStudents.add("Prathmesh");

        System.out.println("Present Students: " + presentStudents);

        presentStudents.remove("Varad");

        System.out.println("After removal : "+ presentStudents);

        if(presentStudents.contains("Kunal")){
            System.out.println("Kunal is present");
        }
        System.out.println("Total Present: " + presentStudents.size());

        String [] studentsArray = presentStudents.toArray(new String[0]);
        System.out.println("Students Array:");
        for (String student : studentsArray) {
            System.out.println(student);
        }
    }
}
