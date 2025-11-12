class StaticKeyword {
    static long factorial(int n) {  // static method
        long fact = 1;              // local variable
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(StringExample[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
