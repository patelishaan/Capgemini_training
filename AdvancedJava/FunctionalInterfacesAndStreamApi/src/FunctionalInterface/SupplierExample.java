package FunctionalInterface;
import java.util.function.Supplier;
public class SupplierExample {
    static void main() {
        Supplier<String> s = new Supplier<String>() {
            @Override
            public String get() {
                return "Supplier Inner Class";
            }
        };
        System.out.println(s.get());
        Supplier s1 = ()->"suppplier lambda";
        System.out.println(s1.get());
    }
}
