package Stream;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighest {
    public static int findSecondHighest(int[] arr){
        return Arrays.stream(arr)
                .distinct() //remove duplicates
                .boxed()//convert intstream to Stream<Integer>
                .sorted(Comparator.reverseOrder())//sort descending
                .skip(1)//skip highest
                .findFirst()//get second highest
                .orElse(-1);//return -1 if not present
    }
    public static void main(String[] args){
        int[] arr={10,20,5,20,8};
        System.out.println(findSecondHighest(arr));
    }
}
