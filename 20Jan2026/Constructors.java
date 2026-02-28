/**
 * Constructors in Java - default and parameterized
 * Topic: Programming Foundation with Java - 20 Jan 2026
 */
public class Constructors {
    String title;
    int value;

    // Default constructor (no-arg)
    Constructors() {
        title = "Default";
        value = 0;
    }

    // Parameterized constructor
    Constructors(String title, int value) {
        this.title = title;
        this.value = value;
    }

    public static void main(String[] args) {
        Constructors c1 = new Constructors();
        System.out.println("Default: " + c1.title + ", " + c1.value);

        Constructors c2 = new Constructors("Custom", 42);
        System.out.println("Parameterized: " + c2.title + ", " + c2.value);
    }
}
