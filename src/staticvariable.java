public class staticvariable {
    static int age=20;
    static void display(){
        System.out.println("age:"+age);
    }
    // cannot use non-static variables inside a static method without creating an object.
    public static void main(String[] args) {
        // can access it using classname
        staticvariable.display();

    }
}
