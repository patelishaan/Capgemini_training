/**
 * What Do You Do with a Collection? - add, remove, iterate, search
 * Topic: Programming Foundation with Java - 30 Jan 2026
 */
import java.util.ArrayList;
import java.util.Collection;

public class CollectionsOverview {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        col.add("One");
        col.add("Two");
        col.add("Three");

        System.out.println("Size: " + col.size());
        System.out.println("Contains Two: " + col.contains("Two"));
        col.remove("Two");
        System.out.println("After remove: " + col);
        System.out.println("Is empty: " + col.isEmpty());

        for (String s : col) System.out.println(s);
    }
}
