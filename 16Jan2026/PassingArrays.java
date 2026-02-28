/**
 * Passing arrays to methods - by reference
 * Topic: Programming Foundation with Java - 16 Jan 2026
 */
public class PassingArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before: " + arr[0]);

        // Array is passed by reference - changes reflect in caller
        modifyArray(arr);
        System.out.println("After modifyArray: " + arr[0]);

        // Passing and returning array
        int[] doubled = doubleValues(arr);
        System.out.print("Doubled array: ");
        for (int x : doubled) System.out.print(x + " ");
    }

    static void modifyArray(int[] a) {
        if (a.length > 0) {
            a[0] = 100;  // Modifies original array
        }
    }

    static int[] doubleValues(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * 2;
        }
        return result;
    }
}
