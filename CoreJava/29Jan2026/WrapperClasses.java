/**
 * Wrapper classes - Integer, Double, Boolean, etc.
 * Topic: Programming Foundation with Java - 29 Jan 2026
 */
public class WrapperClasses {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        Double d = Double.valueOf(3.14);
        Boolean b = Boolean.valueOf(true);

        System.out.println("Integer: " + i);
        System.out.println("Double: " + d);
        System.out.println("Parse string: " + Integer.parseInt("42"));
        System.out.println("Parse double: " + Double.parseDouble("2.5"));

        // Converting back to primitive
        int prim = i.intValue();
        System.out.println("Unboxed: " + prim);
    }
}
