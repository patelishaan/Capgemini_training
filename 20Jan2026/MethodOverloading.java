/**
 * Method overloading - same name, different parameters
 * Topic: Programming Foundation with Java - 20 Jan 2026
 */
public class MethodOverloading {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("add(2, 3) = " + add(2, 3));
        System.out.println("add(2, 3, 4) = " + add(2, 3, 4));
        System.out.println("add(2.5, 3.5) = " + add(2.5, 3.5));
        System.out.println("add(\"Hello \", \"World\") = " + add("Hello ", "World"));
    }
}
