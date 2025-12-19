public class StringMethodsPractise {
    public static void main(String [] args){
        String str = " Java Programming Language";
        String str2 = " java programming language";

        System.out.println("Original String: [" + str + "]");
        System.out.println("----------------------------------");

        System.out.println(str.length());
        System.out.println(str2.length());

        System.out.println(str.charAt(2));
        System.out.println(str2.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
    }
}
