import java.util.Arrays;
import java.util.List;
//Find the maximum number in a list of integers.
public class FinindingMaxNumber {
    public static void main(String[]args){

        List<Integer> numbers= Arrays.asList(1,4,1,5,6,7,5,6,32,2);

       int num= numbers.stream().max(Integer::compare).orElseThrow();
       System.out.println(num);

       int num1=numbers.stream().min(Integer::compare).orElseThrow();
       System.out.println(num1);
    }
}
