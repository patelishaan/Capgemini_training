/**
 * Day 1 - 12 Jan 2026
 * Topic: Variables in Java
 * 
 * Variables hold data. Must declare type and name.
 * Naming: camelCase, start with letter or _ or $
 */
public class Variables {
    public static void main(String[] args) {
        int age = 25;           // declaration with initialization
        String name;            // declaration only
        name = "Java Learner";  // assignment later
        
        final double PI = 3.14159;  // constant (final)
        
        System.out.println(name + " is " + age + " years old.");
        System.out.println("PI = " + PI);
    }
}
