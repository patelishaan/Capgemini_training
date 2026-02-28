/**
 * One-dimensional arrays in Java
 * Topic: Programming Foundation with Java - 16 Jan 2026
 */
public class Arrays1D {
    public static void main(String[] args) {
        // Declaration and initialization
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Array literal (inline initialization)
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("Array length: " + numbers.length);
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Traversing with for loop
        System.out.print("Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Enhanced for loop
        System.out.print("Using for-each: ");
        for (int val : values) {
            System.out.print(val + " ");
        }
    }
}
