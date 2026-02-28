/**
 * Using the Collections Framework - common patterns
 * Topic: Programming Foundation with Java - 02 Feb 2026
 */
import java.util.*;

public class UsingCollectionsFramework {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Map<String, Integer> map = new HashMap<>();
        map.put("x", 1);
        map.put("y", 2);

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);
        System.out.println("List size: " + list.size());
        System.out.println("Map get x: " + map.get("x"));
    }
}
