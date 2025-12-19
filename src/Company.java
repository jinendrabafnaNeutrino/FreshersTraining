public class Company {

    public static void main(String [] args){
            Employee e = new Developer();
            e.work();


            Developer d = (Developer) e;
            d.writecode();
            d.work();
    }
}

class Employee {
    void work(){
        System.out.println("Employee is working in company");

    }
}

class Developer extends Employee {
     String name = "";
     void writecode(){
        System.out.println(name);
        System.out.println("Developer writing code");
    }
}
