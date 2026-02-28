/**
 * List Interface - ordered, allows duplicates (ArrayList, LinkedList)
 * Topic: Programming Foundation with Java - 30 Jan 2026
 */
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");  // duplicates allowed
        list.add(1, "Mango");  // insert at index

        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
        System.out.println("Get(2): " + list.get(2));
        System.out.println("Index of Banana: " + list.indexOf("Banana"));
        list.remove("Mango");
        System.out.println("After remove: " + list);
    }
}
