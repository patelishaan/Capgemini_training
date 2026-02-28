/**
 * Set Interface - no duplicates, unordered (or sorted with TreeSet)
 * Topic: Programming Foundation with Java - 30 Jan 2026
 */
import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // duplicate ignored
        set.add("Cherry");

        System.out.println("Set: " + set);
        System.out.println("Contains Banana: " + set.contains("Banana"));
        set.remove("Banana");
        System.out.println("Size: " + set.size());
        for (String s : set) System.out.println(s);
    }
}
