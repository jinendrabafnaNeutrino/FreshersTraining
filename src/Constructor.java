class student{
    StringExample name;
    student(StringExample n){ // Constructor
        name = n;
    }
    void show(){
        System.out.println(name);
    }
}
public class Constructor {
    public static void main(StringExample[] args) {
        student s = new student("Sahil");
        s.show();
    }
}
