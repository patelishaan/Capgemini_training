/**
 * Java Operators - Arithmetic, Relational, Logical, Bitwise
 * Topic: Programming Foundation with Java - 13 Jan 2026
 */
public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10, b = 3;
        System.out.println("Arithmetic: " + a + " + " + b + " = " + (a + b));
        System.out.println("Arithmetic: " + a + " - " + b + " = " + (a - b));
        System.out.println("Arithmetic: " + a + " * " + b + " = " + (a * b));
        System.out.println("Arithmetic: " + a + " / " + b + " = " + (a / b));
        System.out.println("Arithmetic: " + a + " % " + b + " = " + (a % b));

        // Relational operators
        System.out.println("\nRelational: a > b = " + (a > b));
        System.out.println("Relational: a < b = " + (a < b));
        System.out.println("Relational: a == b = " + (a == b));
        System.out.println("Relational: a != b = " + (a != b));

        // Logical operators
        boolean x = true, y = false;
        System.out.println("\nLogical: x && y = " + (x && y));
        System.out.println("Logical: x || y = " + (x || y));
        System.out.println("Logical: !x = " + (!x));

        // Unary operators
        int n = 5;
        System.out.println("\nUnary: n++ = " + (n++));
        System.out.println("Unary: ++n = " + (++n));
    }
}
