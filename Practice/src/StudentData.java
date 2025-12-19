

import java.util.Scanner;

class Student {
    public int roll_no;
    public String name;

    Student(String name, int roll_no)
    {
        this.name=name;
        this.roll_no=roll_no;
    }

}
public class StudentData{
    public static void main(String args[])
    {
        int roll_no;
        String name;
        int count;

        Student arr[];
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter no. of students");
        count=sc.nextInt();

        arr=new Student[count];

        System.out.println("Enter roll no. and name");
        for(int i=0; i<count; i++)
        {
            roll_no=sc.nextInt();
            name=sc.next();
            arr[i]=new Student(name,roll_no);
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("roll_no"+ arr[i].roll_no + " " + "name:"+" "+arr[i].name);
        }

    }
}
