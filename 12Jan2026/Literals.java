/**
 * Day 1 - 12 Jan 2026
 * Topic: Literals in Java
 * 
 * Literals are fixed values in source code.
 * Integer: 42, 0xFF (hex), 0b1010 (binary), 100L (long)
 * Floating: 3.14, 3.14f, 2.5e3
 * Character: 'A', '\n', '\u0041'
 * String: "Hello"
 * Boolean: true, false
 */
public class Literals {
    public static void main(String[] args) {
        int decimal = 42;
        int hex = 0xFF;      // 255
        int binary = 0b1010; // 10
        long big = 100L;
        
        double d = 3.14;
        float f = 2.5f;
        double scientific = 2.5e3;  // 2500.0
        
        char letter = 'A';
        char newline = '\n';
        
        String greeting = "Hello, Java!";
        boolean ok = true;
        
        System.out.println(decimal + ", " + hex + ", " + binary);
        System.out.println(greeting + " " + ok);
    }
}
