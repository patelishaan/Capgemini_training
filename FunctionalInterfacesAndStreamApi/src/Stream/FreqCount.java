package Stream;
import java.util.stream.*;
import java.util.*;
public class FreqCount {
    public static void main(String[] args){
        int[] arr={1,2,2,3,1,4};
        Map<Integer, Long> frquencyMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(num->num,Collectors.counting()));
        frquencyMap.forEach((key,value)-> System.out.println(key+"->"+value));
    }
}
