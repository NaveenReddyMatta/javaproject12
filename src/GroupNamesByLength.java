import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNamesByLength {

    public static void main (String[]args){
        List<Integer> num= Arrays.asList(1,2,3,4,5);
       List<String > names= Arrays.asList("naveen","reddy","matta","vijaya","Lakshii");

        Map<Integer,List<String>> data = names.stream().collect(Collectors.groupingBy(String::length));

        data.entrySet().
                forEach
(entry -> System.out.println(entry.getKey()+"++++++++++++"+entry.getValue()));

    }

}
