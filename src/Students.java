public class Students {
    String name;
    int age;

    Students(){
        name="unknown";
        age =23;
    }

    Students(String n){
        name = n;
        age = 0;

    }
    Students(String n , int a){
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String [] args){
        Students s1 = new Students();
        Students s2 = new Students("Nitish");
        Students s3 = new Students("Nitish",23);

        s1.display();
        s2.display();
        s3.display();


    }
}
