/**
 * Autoboxing with Collections - primitives in generic collections
 * Topic: Programming Foundation with Java - 02 Feb 2026
 */
import java.util.ArrayList;
import java.util.List;

public class AutoboxingWithCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);   // autoboxing: int -> Integer
        list.add(2);
        list.add(3);

        int sum = 0;
        for (Integer i : list) {
            sum += i;   // unboxing: Integer -> int
        }
        System.out.println("Sum: " + sum);
        System.out.println("List: " + list);
    }
}
