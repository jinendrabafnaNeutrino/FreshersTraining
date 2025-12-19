package collectionPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExecution {
    public static void main(String args[])
    {
        List<Employee> Employee=new ArrayList<>();
        Employee.add(new Employee("Snehal",24));
        Employee.add(new Employee("shubhangi",25));
        Employee.add(new Employee("sneha",22));

        Employee.sort(Comparator.comparingInt(e->e.age));

        System.out.println("the youngest one: "+ Employee.getFirst());

    }


}
