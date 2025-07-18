import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Concatenate all strings from a list separated by commas.
public class ConcatinateStrings {

    public static void main(String[]args){

        List<String > s= Arrays.asList("naveen","abc","cde");
        System.out.println(s);

        String s1=s.stream().collect(Collectors.joining("*"));
        System.out.println(s1);
    }
}
