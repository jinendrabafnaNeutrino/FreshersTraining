public class PassByValue {
    void value(int x){
        x=10;
    }

    public static void main(StringExample[] args) {
        PassByValue p = new PassByValue();
        int a = 20;
        p.value(a);
        System.out.println(a);
    }
}
