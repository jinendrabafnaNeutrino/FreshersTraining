class NestedIf {
    public static void main(StringExample[] args) {
        int a = 20;
        if(a>10) System.out.println("Greater than 10");
        else System.out.println("Less");

        if(a>10) {
            if(a>30) System.out.println("Greater than 30");
            else System.out.println("Between 10 and 30");
        }
    }
}
