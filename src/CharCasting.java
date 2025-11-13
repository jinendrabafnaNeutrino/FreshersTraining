public class CharCasting {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch;  // char - int (widening, implicit)
        System.out.println(ascii);  // 65

        int num = 66;
        char letter = (char) num;  // int - char (narrowing , explicit)
        System.out.println(letter);  // B
    }
}
