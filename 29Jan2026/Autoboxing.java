/**
 * Autoboxing and unboxing - automatic conversion between primitives and wrappers
 * Topic: Programming Foundation with Java - 29 Jan 2026
 */
import java.util.ArrayList;

public class Autoboxing {
    public static void main(String[] args) {
        // Autoboxing: primitive -> wrapper
        Integer i = 10;           // same as Integer.valueOf(10)
        Double d = 3.14;

        // Unboxing: wrapper -> primitive
        int n = i;                // same as i.intValue()
        double x = d;

        // With collections (only objects allowed)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);              // autoboxing: int -> Integer
        list.add(10);
        int first = list.get(0);  // unboxing: Integer -> int
        System.out.println("First: " + first);
    }
}
