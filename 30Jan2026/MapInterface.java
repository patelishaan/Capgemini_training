/**
 * Map Interface - key-value pairs (HashMap, TreeMap)
 * Topic: Programming Foundation with Java - 30 Jan 2026
 */
import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);
        map.put("Alice", 26);  // overwrites previous value

        System.out.println("Map: " + map);
        System.out.println("Alice's age: " + map.get("Alice"));
        System.out.println("Contains Bob: " + map.containsKey("Bob"));
        map.remove("Charlie");
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
    }
}
