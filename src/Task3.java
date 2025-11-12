import java.util.ArrayList;

class Student {
    String name;
    Integer age;      // use Integer instead of int to allow null
    String studentId;

    // Constructor
    public Student(String name, Integer age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    //override toString to print only name
//    @Override
    public String toString() {
        return name;
    }
}

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Adding students
        students.add(new Student("Alice", 20, "S101"));
        students.add(new Student("Bob", 22, "S102"));
        students.add(new Student("Charlie", 21, "S103"));

        // Accessing only names
        for (Student s : students) {
            System.out.println("Name: " + s.getName()); // only name, age and id not accessed
        }

        // If you try to print age or id without getter or accessing directly, you can get null
        System.out.println("\nDirect access example:");
        for (Student s : students) {
            System.out.println("Name: " + s.name + ", Age: " + null + ", ID: " + null);
        }
    }
}

