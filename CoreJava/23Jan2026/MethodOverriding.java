/**
 * Method overriding - subclass provides its own implementation
 * Topic: Programming Foundation with Java - 23 Jan 2026
 */
class Parent {
    void display() { System.out.println("Parent display"); }
    String getInfo() { return "Parent"; }
}

class Child extends Parent {
    @Override
    void display() { System.out.println("Child display"); }
    @Override
    String getInfo() { return "Child"; }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.display();   // Child display - overridden method
        System.out.println(p.getInfo());  // Child
    }
}
