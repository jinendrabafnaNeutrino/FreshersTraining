public class ThisExample {
    private int x;
    ThisExample(int x){
        this.x =  x;
    }

    public static void main(String[] args) {
        ThisExample t = new ThisExample(5);
        System.out.println(t.x);
    }
}

