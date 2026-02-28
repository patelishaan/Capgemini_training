package FunctionalInterface;
import java.util.function.Consumer;
public class ConsumerExample {
    static void main() {
        Consumer<String> consumer = new Consumer<String>(){
            @Override
            public void accept(String s){
                System.out.println(s);
            }
        };
        consumer.accept("Consumer InnerClass - qwerty");
        Consumer<Integer> consumer1 = number->{
            System.out.println(number);
        };
        consumer1.accept(20);
    }
}
