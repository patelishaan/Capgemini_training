package FunctionalInterface;
import java.util.function.Function;
public class FunctionExample {
    static void main() {
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        };
        System.out.println(function.apply(12));
        Function<Integer,Integer> function1 = number->number*number;
        System.out.println(function1.apply(11));
    }
}
