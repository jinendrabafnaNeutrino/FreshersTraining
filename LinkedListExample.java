import java.util.LinkedList;

class Students{
    // Instance Variables
    String name;
    int id;
    int age;

    // Parameterized Constructor
    Students(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + " | ID: " + id + " | Age: " + age);
    }
}

public class LinkedListExample {
    public static void main(String[] args) {

        // Creating LinkedList of Student type
        LinkedList<Students> studentList = new LinkedList<>();

        // Adding student objects
        studentList.add(new Students("Amit", 101, 20));
        studentList.add(new Students("Sneha", 102, 21));
        studentList.add(new Students(   "Rohan", 103, 19));

        // Display all students
        System.out.println("Student Details: ");
        for (Students s : studentList) {
            s.display();
        }
    }
}
