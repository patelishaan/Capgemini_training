/**
 * Polymorphism - same interface, different behavior (compile-time and runtime)
 * Topic: Programming Foundation with Java - 22 Jan 2026
 */
class Animal {
    void sound() { System.out.println("Some sound"); }
}

class Cat extends Animal {
    void sound() { System.out.println("Meow"); }
}

class Cow extends Animal {
    void sound() { System.out.println("Moo"); }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a;
        a = new Cat();
        a.sound();  // Meow - runtime polymorphism

        a = new Cow();
        a.sound();  // Moo

        // Compile-time polymorphism (overloading)
        System.out.println(add(1, 2));
        System.out.println(add(1.0, 2.0));
    }
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
}
