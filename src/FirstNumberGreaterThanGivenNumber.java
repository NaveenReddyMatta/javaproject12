import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstNumberGreaterThanGivenNumber {

    public static void main(String[]args){
        List<Integer> numberes= Arrays.asList(11,2,43,4,5,1,10,12);
        //  int num= numberes.stream().max(Integer::compare).map(i -> i +1).orElseThrow();
        List<Integer> numberes1=   numberes.stream().filter(i -> i > 10).sorted().collect(Collectors.toList());
       System.out.println(numberes1.getFirst());

    }
}
