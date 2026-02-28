/**
 * Sorting Collections and Arrays
 * Topic: Programming Foundation with Java - 02 Feb 2026
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollectionsAndArrays {
    public static void main(String[] args) {
        // Sort array
        int[] arr = {30, 10, 20, 5};
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Sort List
        List<Integer> list = new ArrayList<>(Arrays.asList(30, 10, 20, 5));
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // Reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse: " + list);
    }
}
