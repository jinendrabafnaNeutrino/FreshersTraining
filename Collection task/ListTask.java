package Practice;

import java.util.*;

// Define the Student class
class Student1 {
    private String name;
    private int stud_id;
    private int age;

    // ✅ Constructor
    public Student1(String name, int stud_id, int age) {
        this.name = name;
        this.stud_id = stud_id;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getStudId() {
        return stud_id;
    }

    public int getAge() {
        return age;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + stud_id + ", Age: " + age);
    }
}

// ✅ Main class
public class ListTask {
    public static void main(String[] args) {
        // Using ArrayList
        List<Student1> arrayList = new ArrayList<>();

        // Adding data
        arrayList.add(new Student1("Varad", 101, 22));
        arrayList.add(new Student1("Onkar", 102, 23));
        arrayList.add(new Student1("Aniket", 103, 21));

        System.out.println(" --> Using ArrayList ");
        displayStudents(arrayList);
        System.out.println("Number of students: " + arrayList.size());

        // Remove a student by ID
        removeStudentById(arrayList, 102);
        System.out.println("\nAfter removing student with ID 102:");
        displayStudents(arrayList);

        // Search a student by name
        searchStudentByName(arrayList, "Varad");

        //  Using LinkedList
        List<Student1> linkedList = new LinkedList<>();

        linkedList.add(new Student1("Ganesh", 201, 22));
        linkedList.add(new Student1("Suyog", 202, 23));

        System.out.println("\n --> Using LinkedList ");
        displayStudents(linkedList);
        System.out.println("Number of students: " + linkedList.size());
    }

    // Method to display students
    public static void displayStudents(List<Student1> list) {
        for (Student1 s : list) {
            s.displayInfo();
        }
    }

    // Method to remove student by ID
    public static void removeStudentById(List<Student1> list, int id) {
        Iterator<Student1> itr = list.iterator();
        while (itr.hasNext()) {
            Student1 s = itr.next();
            if (s.getStudId() == id) {
                itr.remove();
                System.out.println("Removed student with ID: " + id);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found!");
    }

    // Method to search student by name
    public static void searchStudentByName(List<Student1> list, String name) {
        for (Student1 s : list) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("\nFound Student:");
                s.displayInfo();
                return;
            }
        }
        System.out.println("\nStudent with name " + name + " not found!");
    }
}
