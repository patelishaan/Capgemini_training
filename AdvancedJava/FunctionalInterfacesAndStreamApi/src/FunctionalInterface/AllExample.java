package FunctionalInterface;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class AllExample {
    static void main() {
        List<String> names = List.of("Ram","Shyam","Sita");
        Predicate<String> filter = name->name.startsWith("S");
        Function<String, String> transform = String::toUpperCase;
        Consumer<String> print = System.out::print;
        names.stream()
                .filter(filter)
                .map(transform)
                .forEach(print);
        System.out.println("\nFunctional\tInterface");
    }
}
