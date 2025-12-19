class Person
{
    void get_role()
    {
        System.out.println("person");
    }
}
class Employee extends Person
{
//    void get_role()
//    {
//        System.out.println("Employee");
//    }

    void get_salary()
    {
        System.out.println("salary");
    }
}
class Student extends Person
{
    void get_role()
    {
        System.out.println("student");
    }
}

public class UpCasting {
    public  static  void main(String[] args)
    {
        Person p;
        p = new Employee();
        p.get_role();


        p=new Student();
        p.get_role();

        //downcasting
        Person p2= new Employee();
        Employee e= (Employee)p2;
        e.get_role();
        e.get_salary();
    }
}
