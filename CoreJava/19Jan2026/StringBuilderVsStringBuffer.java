/**
 * StringBuilder vs StringBuffer - mutable strings
 * Topic: Programming Foundation with Java - 19 Jan 2026
 */
public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {
        // StringBuilder - not thread-safe, faster (use in single-threaded code)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.reverse();
        System.out.println("StringBuilder: " + sb);

        // StringBuffer - thread-safe (synchronized), use in multi-threaded code
        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Foundation");
        sbf.insert(4, " ");
        System.out.println("StringBuffer: " + sbf);

        // When to use:
        // - String: immutable, use when value won't change
        // - StringBuilder: many modifications, single thread
        // - StringBuffer: many modifications, multiple threads
    }
}
