//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.dogSound();
        Child d = new Child();
        d.dogBarks();
        Child child = (Child)parent;
        child.dogBarks();

    }
}