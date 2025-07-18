import java.util.ArrayList;
import java.util.List;
//Given a list of integers, find the sum of all even numbers and odd numbers.
public class Numbers {

    public static void main(String[] args){

        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        int sum=list.stream().mapToInt(Integer::intValue).sum();//sum of all numbers
        System.out.println(sum);

        int evenSum=list.stream().filter(m -> m%2==0).mapToInt(Integer::intValue).sum();//sum of even numbers
        System.out.println(evenSum);

        int oddSum=list.stream().filter(n -> n%2!=0).mapToInt(Integer::intValue).sum();//sum of odd numbers
        System.out.println(oddSum);

    }

}
