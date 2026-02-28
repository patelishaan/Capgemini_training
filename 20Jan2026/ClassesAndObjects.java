/**
 * Classes and Objects in Java
 * Topic: Programming Foundation with Java - 20 Jan 2026
 */
public class ClassesAndObjects {
    // Instance variables (fields)
    String name;
    int age;

    public static void main(String[] args) {
        // Creating an object
        ClassesAndObjects person = new ClassesAndObjects();
        person.name = "Alice";
        person.age = 25;

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);

        // Another object - each has its own copy of instance variables
        ClassesAndObjects person2 = new ClassesAndObjects();
        person2.name = "Bob";
        person2.age = 30;
        System.out.println("Name: " + person2.name + ", Age: " + person2.age);
    }
}
