//No-arg constructor
public class Student {

    String name;
    Student(){
        name = "Unknown";
    }

    public static void main(String[] args) {
        Student s= new Student();
        System.out.println(s.name);
    }
}
