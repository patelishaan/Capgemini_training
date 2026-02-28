/**
 * Array initialization - different ways
 * Topic: Programming Foundation with Java - 16 Jan 2026
 */
public class ArrayInitialization {
    public static void main(String[] args) {
        // 1. Default initialization (zeros for int, null for objects)
        int[] a = new int[5];
        System.out.println("Default int array: " + a[0] + ", " + a[4]);

        // 2. Inline initialization
        int[] b = {10, 20, 30, 40, 50};

        // 3. Initialize with loop
        int[] c = new int[5];
        for (int i = 0; i < c.length; i++) {
            c[i] = (i + 1) * 10;
        }

        // 4. Anonymous array (passed to method)
        printArray(new int[]{1, 2, 3, 4, 5});

        // 5. String array
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("\nNames: " + String.join(", ", names));
    }

    static void printArray(int[] arr) {
        System.out.print("Anonymous array: ");
        for (int x : arr) System.out.print(x + " ");
    }
}
