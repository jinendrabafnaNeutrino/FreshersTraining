       class Animal{
            void sound(){

                System.out.println("Animal makes a sound");
            }

        }
        class dog extends Animals {
            void bark()
            {
                System.out.println("Dog barks");
            }
        }
       public class UpcastingExample {

           public static void main(String[] args) {

               Animals a = new dog(); // upcasting
               a.sound();
           }
       }

