/**
 * Garbage collection - unreachable objects, System.gc(), finalize (deprecated)
 * Topic: Programming Foundation with Java - 29 Jan 2026
 */
public class GarbageCollection {
    public static void main(String[] args) {
        GarbageCollection g1 = new GarbageCollection();
        GarbageCollection g2 = new GarbageCollection();
        g1 = null;   // g1 no longer referenced - eligible for GC
        g2 = g1;     // g2's previous object now unreachable

        // Hint to JVM (not guaranteed to run immediately)
        System.gc();
        System.out.println("GC requested - JVM may collect unreachable objects.");
    }
}
