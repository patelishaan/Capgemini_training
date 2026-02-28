/**
 * Other Navigation Methods - pollFirst, descendingSet, subMap, etc.
 * Topic: Programming Foundation with Java - 02 Feb 2026
 */
import java.util.TreeSet;
import java.util.NavigableSet;

public class OtherNavigationMethods {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(5); set.add(10); set.add(15); set.add(20); set.add(25);

        System.out.println("Original: " + set);
        System.out.println("first(): " + set.first());
        System.out.println("last(): " + set.last());
        System.out.println("pollFirst(): " + set.pollFirst() + " -> " + set);
        System.out.println("pollLast(): " + set.pollLast() + " -> " + set);

        set.add(5); set.add(25);
        System.out.println("descendingSet(): " + set.descendingSet());
        System.out.println("subSet(10, 20): " + set.subSet(10, 20));
        System.out.println("subSet(10, true, 20, true): " + set.subSet(10, true, 20, true));
    }
}
