import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.List;

public class LengthOfStrings {

    public static void main(String [] args){

        //List<String > names= Arrays.asList("asasas","qwe","");
        String [] arr = {"venkat","reddy","navin","reddy"};
        int [] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i].length();
        }
        int sum=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            sum = sum+arr1[i];
        }
        System.out.println(sum);
        System.out.println(count);
        System.out.println(sum/count);

//       names.stream().map(String::length).forEach(System.out::println);

    }

}
