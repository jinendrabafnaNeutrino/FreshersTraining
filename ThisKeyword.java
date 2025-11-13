class name{
    StringExample n;
    name(StringExample n){
        this.n=n;
    }
    void show(){
        System.out.println(n);
    }
}
public class ThisKeyword {
    public static void main(StringExample[] args) {
        name n = new name("Sahil");
        n.show();
    }
}
