public class Whatsapp {

        void send_message(String msg)
        {
            System.out.println("Sending msg: "+msg);
        }
        void send_message(String msg,String photo)
        {
            System.out.println("Sending photo and msg: " + msg +" " + photo);
        }
        void send_message(String msg,String photo, String video)
        {
            System.out.println("Sending photo,video and msg: "+ msg  +" " + photo +" " + video);
        }

    }

