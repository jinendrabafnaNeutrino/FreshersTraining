import java.util.Scanner;

class Employee
{
    String emp_name;
    int salary;


    public void addEmployee(String emp_name,int salary)
    {
        this.emp_name=emp_name;
        this.salary=salary;
        System.out.println("Employee name: "+emp_name + "\nSalary: "+salary);
    }
}


public class MethodCalling {
    public static void  main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Employee emp= new Employee();
        emp.addEmployee("snehal",20000);
    }
}
