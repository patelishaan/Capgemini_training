/**
 * Casting - upcasting and downcasting with reference types
 * Topic: Programming Foundation with Java - 23 Jan 2026
 */
class Animal { void eat() { System.out.println("Animal eats"); } }
class Dog extends Animal { void bark() { System.out.println("Dog barks"); } }

public class Casting {
    public static void main(String[] args) {
        // Upcasting (implicit) - subclass to superclass
        Animal a = new Dog();
        a.eat();
        // a.bark();  // compile error - Animal doesn't have bark()

        // Downcasting (explicit) - superclass reference to subclass
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.bark();
            d.eat();
        }

        // Invalid downcast would throw ClassCastException at runtime
        // Dog d2 = (Dog) new Animal();  // runtime error
    }
}
