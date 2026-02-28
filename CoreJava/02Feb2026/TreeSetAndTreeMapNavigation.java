/**
 * Navigating (Searching) TreeSets and TreeMaps - sorted, navigation methods
 * Topic: Programming Foundation with Java - 02 Feb 2026
 */
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.NavigableSet;
import java.util.NavigableMap;

public class TreeSetAndTreeMapNavigation {
    public static void main(String[] args) {
        // TreeSet - sorted set, NavigableSet methods
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(10); set.add(20); set.add(30); set.add(40);
        System.out.println("TreeSet: " + set);
        System.out.println("lower(25): " + set.lower(25));   // 20
        System.out.println("higher(25): " + set.higher(25));  // 30
        System.out.println("floor(25): " + set.floor(25));   // 20
        System.out.println("ceiling(25): " + set.ceiling(25)); // 30
        System.out.println("headSet(30): " + set.headSet(30));
        System.out.println("tailSet(20): " + set.tailSet(20));

        // TreeMap - sorted by keys
        NavigableMap<String, Integer> map = new TreeMap<>();
        map.put("Bob", 30); map.put("Alice", 25); map.put("Charlie", 28);
        System.out.println("TreeMap: " + map);
        System.out.println("firstKey: " + map.firstKey());
        System.out.println("lowerKey(Bob): " + map.lowerKey("Bob"));
        System.out.println("higherKey(Bob): " + map.higherKey("Bob"));
    }
}
