package FunctionalInterface;
import java.util.function.Predicate;

public class PredicateExample {
    static void main() {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>=11;

                }
            };
        System.out.println(predicate.test(10));
        Predicate<Integer> p1 = number->number>0;//lamba expression, check if number > 0
        System.out.println(p1.test(10));
        }
    }


