public class classandobject {
    String name = "Sneha";
    void display(){
        System.out.println("name:"+name);
    }
    public static void main(String[] args) {
        classandobject obj =new classandobject();
        obj.display();
        System.out.println(obj.name);
    }
}
