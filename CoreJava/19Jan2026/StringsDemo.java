/**
 * Java Strings - basics and creation
 * Topic: Programming Foundation with Java - 19 Jan 2026
 */
public class StringsDemo {
    public static void main(String[] args) {
        // String literal (stored in string pool)
        String s1 = "Hello";
        String s2 = "Hello";

        // Using new keyword (creates new object in heap)
        String s3 = new String("Hello");

        System.out.println("s1 == s2 (same literal): " + (s1 == s2));
        System.out.println("s1 == s3 (literal vs new): " + (s1 == s3));
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        // Concatenation
        String name = "Java";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);

        // String is immutable
        String x = "abc";
        x = x.concat("def");  // x now refers to new string "abcdef"
        System.out.println("After concat: " + x);
    }
}
