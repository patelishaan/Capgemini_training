/**
 * Day 1 - 12 Jan 2026
 * Topic: JVM (Java Virtual Machine)
 * 
 * JVM is the runtime that executes Java bytecode.
 * Flow: .java source -> javac compiler -> .class bytecode -> JVM executes
 * JVM provides: memory management, garbage collection, security, portability.
 */
public class JVM {
    public static void main(String[] args) {
        // JVM loads this class and executes main
        System.out.println("Running on JVM: " + System.getProperty("java.version"));
    }
}
