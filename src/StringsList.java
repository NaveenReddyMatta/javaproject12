import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Convert a list of strings to uppercase using streams.
public class StringsList {

    public static void main(String[]args){

        String[] names={"naveen","sowji","devi"};

        List<String> str= new ArrayList<>();
        str.addAll(Arrays.asList(names));

        // converting the list of lower case strings to upper case
      List<String > uppercaseList=  str.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());
      System.out.println(uppercaseList);

      str.stream().map(String::toUpperCase).forEach(System.out::println);
    }

}
