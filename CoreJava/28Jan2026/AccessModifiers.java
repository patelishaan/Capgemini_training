/**
 * Access modifiers - public, protected, default (package), private
 * Topic: Programming Foundation with Java - 28 Jan 2026
 */
class ModifierDemo {
    public int a = 1;       // accessible everywhere
    protected int b = 2;    // same package + subclasses
    int c = 3;              // package-private (default)
    private int d = 4;      // only within this class

    void show() {
        System.out.println("a=" + a + " b=" + b + " c=" + c + " d=" + d);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        ModifierDemo m = new ModifierDemo();
        System.out.println("public a: " + m.a);
        System.out.println("protected b: " + m.b);
        System.out.println("default c: " + m.c);
        // System.out.println(m.d);  // compile error - private
        m.show();
    }
}
