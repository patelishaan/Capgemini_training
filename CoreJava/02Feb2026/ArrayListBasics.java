/**
 * ArrayList Basics - dynamic array, common operations
 * Topic: Programming Foundation with Java - 02 Feb 2026
 */
import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15);  // insert at index 1

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Get(2): " + list.get(2));
        list.set(0, 100);
        System.out.println("After set: " + list);
        list.remove(1);   // remove by index
        System.out.println("After remove: " + list);
    }
}
