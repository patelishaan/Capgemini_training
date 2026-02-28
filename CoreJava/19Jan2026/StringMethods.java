/**
 * Common String methods in Java
 * Topic: Programming Foundation with Java - 19 Jan 2026
 */
public class StringMethods {
    public static void main(String[] args) {
        String s = "  Hello World  ";

        System.out.println("Length: " + s.length());
        System.out.println("charAt(1): " + s.charAt(1));
        System.out.println("substring(2,7): " + s.substring(2, 7));
        System.out.println("toLowerCase: " + s.toLowerCase());
        System.out.println("toUpperCase: " + s.toUpperCase());
        System.out.println("trim: '" + s.trim() + "'");
        System.out.println("indexOf('o'): " + s.indexOf('o'));
        System.out.println("replace('o','x'): " + s.replace('o', 'x'));
        System.out.println("contains(\"World\"): " + s.contains("World"));
        System.out.println("startsWith(\"  He\"): " + s.startsWith("  He"));
        System.out.println("endsWith(\"  \"): " + s.endsWith("  "));

        // split
        String csv = "a,b,c";
        String[] parts = csv.split(",");
        System.out.println("split: " + java.util.Arrays.toString(parts));
    }
}
