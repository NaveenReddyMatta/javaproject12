import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition {

    public static void main(String[]args){

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        Map<Boolean,List<Integer>> partitionList=  numbers.stream().collect(Collectors.partitioningBy(i -> i % 2==0));

        System.out.println(partitionList.get(true));
        System.out.println(partitionList.get(false));

        partitionList.forEach((status ,list) -> {
            if(status){
                System.out.println("Even Numbers list : "+status );
                list.forEach(System.out::println);
            }else {
                System.out.println("Odd Numbers list : "+status );
                list.forEach(System.out::println);
            }

        });


    }
}
