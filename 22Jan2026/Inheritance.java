/**
 * Inheritance - IS-A and HAS-A relationships
 * Topic: Programming Foundation with Java - 22 Jan 2026
 */
class Animal {
    void eat() { System.out.println("Eating"); }
}

class Dog extends Animal {  // IS-A: Dog is an Animal
    void bark() { System.out.println("Barking"); }
}

class Engine { void start() { System.out.println("Engine start"); } }

class Car {  // HAS-A: Car has an Engine
    private Engine engine = new Engine();
    void drive() {
        engine.start();
        System.out.println("Driving");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited
        d.bark();

        Car c = new Car();
        c.drive();
    }
}
