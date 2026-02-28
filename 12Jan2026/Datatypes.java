/**
 * Day 1 - 12 Jan 2026
 * Topic: Java Datatypes (Primitive Types)
 * 
 * byte, short, int, long - integer types
 * float, double - floating-point types
 * char - single character (Unicode)
 * boolean - true or false
 */
public class Datatypes {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32000;
        int i = 1000000;
        long l = 9999999999L;
        
        float f = 3.14f;
        double d = 3.14159265359;
        
        char c = 'A';
        boolean flag = true;
        
        System.out.println("byte: " + b + ", int: " + i + ", double: " + d);
        System.out.println("char: " + c + ", boolean: " + flag);
    }
}
