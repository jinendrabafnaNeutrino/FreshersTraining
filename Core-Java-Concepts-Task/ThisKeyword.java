class Employee {
    String name;
    Employee(String name) {
        this.name = name; 
    }
    void show() {
        System.out.println("Employee name: " + this.name);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Employee e1 = new Employee("Varad");
        e1.show();
    }
}
