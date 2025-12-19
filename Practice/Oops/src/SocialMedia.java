
//method overloading
public class SocialMedia {
    public static void main(String[] args)
    {
        Whatsapp w= new Whatsapp();
        w.send_message("hello");
        w.send_message("hello","image1");
        w.send_message("hello","image1","video1");
    }
}
