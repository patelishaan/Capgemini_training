/**
 * Static members - class-level variables and methods
 * Topic: Programming Foundation with Java - 28 Jan 2026
 */
class Counter {
    static int count = 0;
    int id;

    Counter() {
        count++;
        id = count;
    }

    static void showCount() {
        System.out.println("Total instances: " + count);
    }
}

public class StaticMembers {
    static int x = 10;

    public static void main(String[] args) {
        System.out.println("Static x: " + StaticMembers.x);
        new Counter();
        new Counter();
        Counter.showCount();
        System.out.println("PI (Math static): " + Math.PI);
    }
}
