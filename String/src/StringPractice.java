public class StringPractice {
    public static void main(String[] args)
    {
        String msg="hello";
        msg= msg+" Snehal";//new object will created
        System.out.println(msg+" have a nice day");
        System.out.println(msg);

        String str= new String();
        str="String object";
        str=str+" changes";
        System.out.println(str+" created");
        System.out.println(str);

        //String class immutable


        String str1="Neutrino";
        int length=str1.length();
        System.out.println(length);

        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.charAt(3));





    }


}
