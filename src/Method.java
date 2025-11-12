public class Method {
    static void Hello(){
        System.out.println("Hello");
    }
    static int add(int a, int b){
        return a+b;
    }

    public static void main(StringExample[] args) {
        Hello();
        int sum = add(5,5);
        System.out.println("Sum:" + sum);
    }
}
